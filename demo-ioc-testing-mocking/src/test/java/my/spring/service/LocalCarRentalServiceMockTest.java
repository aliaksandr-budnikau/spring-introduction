package my.spring.service;

import my.spring.model.Car;
import my.spring.source.CarSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LocalCarRentalServiceMockTest {

    @Mock
    private CarSource carSource;
    @InjectMocks
    private LocalCarRentalService carRentalService;

    @Test
    public void simpleTest() {
        String expectedTenantName = "Alex";
        String expectedNumber = "9999";

        when(carSource.take()).thenReturn(new Car(expectedNumber));
        Car actualCar = carRentalService.rent(expectedTenantName);

        assertEquals(expectedNumber, actualCar.getNumber());
        assertEquals(expectedTenantName, actualCar.getTenantName());
    }

    @Test
    public void testCaseWhenTheLocalCarSourceIsEmpty() {
        String expectedServiceName = "LocalService";
        String expectedName = "Alex";

        when(carSource.take()).thenReturn(null);
        final CarRentalService carRentalService = new LocalCarRentalService(carSource, expectedServiceName);

        Car car = carRentalService.rent(expectedName);

        assertNull(car);
    }
}