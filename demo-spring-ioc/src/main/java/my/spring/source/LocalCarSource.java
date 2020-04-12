package my.spring.source;

import my.spring.model.Car;
import org.springframework.stereotype.Component;

@Component // mark this class as a service to be scanned by spring and to be used as a bean
public class LocalCarSource implements CarSource {

    private static int counter = 1000;

    public Car take() {
        final int newNumber = counter++;
        return new Car("CN-" + newNumber + "-5");
    }
}
