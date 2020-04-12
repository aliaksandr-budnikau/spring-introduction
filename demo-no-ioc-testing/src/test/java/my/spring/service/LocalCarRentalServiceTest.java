package my.spring.service;

import my.spring.model.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LocalCarRentalServiceTest {

    @Test
    public void simpleTest() {
        String expectedServiceName = "LocalService";
        String expectedName = "Alex";

        final CarRentalService carRentalService = new LocalCarRentalService(expectedServiceName);

        Car car = carRentalService.rent(expectedName);

        assertEquals(expectedServiceName, car.getCarRentalServiceName());
        assertEquals(expectedName, car.getTenantName());
    }

    @Test
    public void testCaseWhenTheLocalCarSourceIsEmpty() {
        String expectedServiceName = "LocalService";
        String expectedName = "Alex";

        // We can impact CarSource behaviour in no way !!
        final CarRentalService carRentalService = new LocalCarRentalService(expectedServiceName);

        Car car = carRentalService.rent(expectedName);

        assertNull(car);
    }
}