package my.spring.service;

import my.spring.model.Car;
import my.spring.source.CarSource;
import my.spring.source.LocalCarSource;

public class LocalCarRentalService implements CarRentalService {

    private final CarSource carSource;
    private final String serviceName;

    public LocalCarRentalService(String serviceName) {
        this.carSource = new LocalCarSource();
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
