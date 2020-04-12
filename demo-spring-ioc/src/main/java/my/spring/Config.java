package my.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // mark this class as a config class
@ComponentScan("my.spring") // specify a package where to find other components/services/repositories/beans
public class Config {

    private static final String SERVICE_NAME = "LocalService";

    @Bean 
    public String carRentalServiceName() {
        return SERVICE_NAME;
    }
}
