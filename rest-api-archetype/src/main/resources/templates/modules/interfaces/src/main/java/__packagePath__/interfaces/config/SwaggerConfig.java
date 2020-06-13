package @packageName@.interfaces.config;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Configuration used by springfox maven plugin to scan and generate swagger docs
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Autowired
    private ApiDocConfig apiDocConfig;

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex(apiDocConfig.getEndpointExclusionList())))
                .build()
                .securitySchemes(Collections.singletonList(apiKey()))
                .useDefaultResponseMessages(apiDocConfig.isUseDefaultResponseMessage())
                .enableUrlTemplating(apiDocConfig.isEnableUrlTemplate())
                .consumes(Sets.newHashSet(apiDocConfig.getContentType()))
                .produces(Sets.newHashSet(apiDocConfig.getContentType()))
                .apiInfo(metaData());
    }

    private ApiKey apiKey() {
        return new ApiKey(apiDocConfig.getApiKeyName(), apiDocConfig.getApiKeyKeyName(), apiDocConfig.getApiKeyPassAs());
    }

    private ApiInfo metaData() {
        return new ApiInfo(
                apiDocConfig.getTitle(),
                apiDocConfig.getDescription(),
                apiDocConfig.getVersion(),
                apiDocConfig.getTermsOfServiceUrl(),
                new Contact(apiDocConfig.getContactName(), apiDocConfig.getContactUrl(), apiDocConfig.getContactEmail()),
                apiDocConfig.getLicense(),
                apiDocConfig.getLicenseUrl(),
                Collections.emptyList());
    }   
}