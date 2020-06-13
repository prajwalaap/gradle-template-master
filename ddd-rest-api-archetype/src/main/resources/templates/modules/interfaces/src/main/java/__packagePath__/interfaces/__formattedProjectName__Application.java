package @packageName@.interfaces;


import @packageName@.interfaces.config.ApiDocConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(ApiDocConfig.class)
@ComponentScan({"@packageName@", "@packageName@.repository"})
public class @formattedProjectName@Application {

    private static final Logger logger = LoggerFactory.getLogger(@formattedProjectName@Application.class);

    public static void main(String[] args) {
        SpringApplication.run(@formattedProjectName@Application.class, args);
    }
}