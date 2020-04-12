package my.spring.model;

public class Car {

    private String number;
    private String tenantName;
    private String carRentalServiceName;

    public Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getCarRentalServiceName() {
        return carRentalServiceName;
    }

    public void setCarRentalServiceName(String carRentalServiceName) {
        this.carRentalServiceName = carRentalServiceName;
    }

    @Override
    public String toString() {
        return "Car{" +
            "number='" + number + '\'' +
            ", tenantName='" + tenantName + '\'' +
            ", carRentalServiceName='" + carRentalServiceName + '\'' +
            '}';
    }
}
