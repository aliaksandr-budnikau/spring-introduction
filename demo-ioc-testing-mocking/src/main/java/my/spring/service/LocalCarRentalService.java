package my.spring.service;

import my.spring.model.Car;
import my.spring.source.CarSource;

public class LocalCarRentalService implements CarRentalService {

    private final CarSource carSource;
    private final String serviceName;

    // This class doesn't know which implementation is hidden behind the CarSource interface! - GOOD!
    public LocalCarRentalService(CarSource carSource, String serviceName) {
        this.carSource = carSource;
        this.serviceName = serviceName;
    }

    public Car rent(String tenantName) {
        final Car car = carSource.take();
        if (car == null) {
            return null;
        }
        car.setTenantName(tenantName);
        car.setCarRentalServiceName(serviceName);
        return car;
    }
}
