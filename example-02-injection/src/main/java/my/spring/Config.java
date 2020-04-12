package my.spring;

import my.spring.component.OtherComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("my.spring")
public class Config {

    //@Bean // an alternative way of a bean creation
    public OtherComponent secondComponent() {
        System.out.println("SecondComponent was created");
        return new OtherComponent() {
        };
    }
}
