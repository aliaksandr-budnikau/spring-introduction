package my.spring.ex06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("my.spring")
@PropertySource("classpath:application.properties")
public class Config {

}