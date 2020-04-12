package my.spring.source;

import my.spring.model.Car;

public class LocalCarSource implements CarSource {

    private static int counter = 1000;

    public Car take() {
        final int newNumber = counter++;
        return new Car("CN-" + newNumber + "-5");
    }
}
