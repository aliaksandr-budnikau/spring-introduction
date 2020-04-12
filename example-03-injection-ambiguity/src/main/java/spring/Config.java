package spring;

import my.spring.component.OtherComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("my.spring")
public class Config {

    @Bean
    public OtherComponent secondComponent() { // a method name can be used as bean name
        System.out.println("SecondComponent was created");
        return new OtherComponent() {
        };
    }
}
