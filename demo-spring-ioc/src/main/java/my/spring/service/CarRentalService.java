package my.spring.service;

import my.spring.model.Car;

public interface CarRentalService {

    Car rent(String tenantName);
}