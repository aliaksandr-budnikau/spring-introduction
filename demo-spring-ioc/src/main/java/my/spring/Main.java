package my.spring;

import my.spring.model.Car;
import my.spring.service.CarRentalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final String TENANT_NAME = "Alex";

    public static void main(String[] args) {
        // application context initialization that is based on Config class
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("\nTOOK A CAR:");

        // getting components/services/repositories/beans from the application context
        CarRentalService carRentalService = context.getBean(CarRentalService.class);

        Car car = carRentalService.rent(TENANT_NAME);
        System.out.println(car);
    }
}
