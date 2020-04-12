package my.spring;

import my.spring.repository.DataRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("my.spring")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Profile("test") // this way we can mark this class to be used only for a production env.
    public DataRepository testDataRepository() {
        System.out.println("testDataRepository was created");
        return new DataRepository() {
            public String getData() {
                return "test data";
            }
        };
    }
}
