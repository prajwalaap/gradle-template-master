# MicroService Layered Architecture 

Project to generate MicroService Layered Architecture API Template

## Generate Projects 
Navigate to corresponding template folder and execute the below command

```
gradle cleanArch generate -i -Dtarget=generated -Dgroup=com.tavant.sample -Dname=demo-service -Dversion=1.0
```
### Parameters
| Param           | Description                                     | Default                        |
| --------------- | ------------------------------------------------| ------------------------------ |
| group           | group name in Gradle, *Mandatory*               |                                |
| name            | name in Gradle, *Mandatory*                     |                                |
| version         | version in Gradle, *Mandatory*                  | 1.0-SNAPSHOT                   |

Default the package name will be generated based on group and name. The package name can be customized via `packageName` system property
Command line:
```
-Dsun.java.command="-DpackageName=com.tavant.sample.demo"
```

## Layers in DDD microservices

* Interfaces Layer
* Application Layer
* Domain Layer
* Infrastructure Layer

### Interfaces Layer
This layer exposes service endpoints for external systems to integrate. RESTful web service endpoints, messaging endpoints, data serialization and data transformation etc are the main responsibility of this layer

### Application Layer
This is a thin layer which coordinates the application activity. It does not contain business logic. It does not hold the state of the business objects, but it can hold the state of an application task progress

### Domain Layer
This layer contains information about the domain. This is the heart of the business software. The state of business objects is held here. Persistence of the business objects and possibly their state is delegated to the infrastructure layer.

In Domain, `repository` contains interfaces for all Domain object. The implementation of the Repositories should be under `Infrastructure` layer. 

### Infrastructure Layer
This layer acts as a supporting library for all the other layers. It provides communication between layers, implements persistence for business objects, caching support and all other cross cutting concerns.

### Documentation

Please refer the 'Micro Service Chassis' section under software factory confluence page for more details - https://confluence.tavant.com/display/SOF/Micro+Service+Chassis




