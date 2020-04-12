package my.spring.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration()
@ComponentScan("my.spring.components")
@PropertySource("classpath:application.properties")
public class Config {

    @Value("${my.spring.resource_users}")
    private String resourceName;

    @Bean
    public ResourceProvider usersResourceProvider() {
        return new ResourceProvider() {
            public void getResource() {
                System.out.println("getting a resource " + resourceName);
            }
        };
    }
}
