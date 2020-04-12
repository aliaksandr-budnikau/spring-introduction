package my.spring.service;

import my.spring.model.Car;
import my.spring.source.CarSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // mark this class as a service to be scanned by spring and to be used as a bean
public class LocalCarRentalService implements CarRentalService {

    private final CarSource carSource;
    private final String serviceName;

    @Autowired // pass beforehand scanned beans/services/components/repositories into this constructor
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
