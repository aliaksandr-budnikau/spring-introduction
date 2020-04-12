package my.spring;

import my.spring.model.Car;
import my.spring.service.CarRentalService;
import my.spring.service.LocalCarRentalService;
import my.spring.source.CarSource;
import my.spring.source.LocalCarSource;

public class Main {

    private static final String TENANT_NAME = "Alex";
    private static final String SERVICE_NAME = "LocalService";

    public static void main(String[] args) {
        System.out.println("\nTOOK A CAR:");
        final CarSource carSource = new LocalCarSource();
        final CarRentalService carRentalService = new LocalCarRentalService(carSource, SERVICE_NAME);

        Car car = carRentalService.rent(TENANT_NAME);
        System.out.println(car);
    }
}
