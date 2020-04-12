package my.spring.service;

import my.spring.model.Car;
import my.spring.source.CarSource;
import my.spring.source.LocalCarSource;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LocalCarRentalServiceTest {

    @Test
    public void simpleTest() {
        String expectedServiceName = "LocalService";
        String expectedName = "Alex";

        final CarSource carSource = new LocalCarSource();
        final CarRentalService carRentalService = new LocalCarRentalService(carSource, expectedServiceName);

        Car car = carRentalService.rent(expectedName);

        assertEquals(expectedServiceName, car.getCarRentalServiceName());
        assertEquals(expectedName, car.getTenantName());
    }

    @Test
    public void testCaseWhenTheLocalCarSourceIsEmpty() {
        String expectedServiceName = "LocalService";
        String expectedName = "Alex";

        // We can impact CarSource behaviour but it is too verbose!!
        CarSource carSource = new CarSource() {
            public Car take() {
                return null;
            }
        };
        final CarRentalService carRentalService = new LocalCarRentalService(carSource, expectedServiceName);

        Car car = carRentalService.rent(expectedName);

        assertNull(car);
    }
}