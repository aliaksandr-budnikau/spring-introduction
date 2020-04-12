package my.spring;

import my.spring.model.Car;
import my.spring.service.CarRentalService;
import my.spring.service.LocalCarRentalService;

public class Main {

    private static final String TENANT_NAME = "Alex";
    private static final String SERVICE_NAME = "LocalService";

    public static void main(String[] args) {
        System.out.println("\nTOOK A CAR:");
        
        // LocalCarRentalService USES LocalCarSource 
        // AND BOTH USE Cars
        final CarRentalService carRentalService = new LocalCarRentalService(SERVICE_NAME);

        Car car = carRentalService.rent(TENANT_NAME);
        System.out.println(car);
    }
}
