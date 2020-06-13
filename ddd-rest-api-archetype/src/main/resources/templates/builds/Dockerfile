# syntax=docker/dockerfile:experimental
# Docker instructions for building the app
FROM gradle:6.4-jdk11 as builder
# Sets the work directory
WORKDIR /usr/src/app

# Copy all files
COPY *.gradle /usr/src/app/
COPY modules/dto/*.gradle /usr/src/app/modules/dto/
COPY modules/infrastructure/*.gradle /usr/src/app/modules/infrastructure/
COPY modules/domain/*.gradle /usr/src/app/modules/domain/
COPY modules/interfaces/*.gradle /usr/src/app/modules/interfaces/

# RUN gradle build -x bootJar --info && gradle clean

COPY . /usr/src/app

# Resolves dependency and cache them
RUN --mount=type=cache,target=/root/.gradle gradle build -i
RUN mkdir -p build/dependency && (cd build/dependency; jar -xf /usr/src/app/modules/interfaces/build/libs/app*.jar)


# Docker instructions for creating final image
FROM openjdk:11.0.7-jre-slim
VOLUME /tmp
ARG DEPENDENCY=/usr/src/app/build/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","@packageName@.interfaces.@formattedProjectName@Application"]