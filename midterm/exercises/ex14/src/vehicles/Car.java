package vehicles;

class Car extends Vehicle {
    String fuelType;

    public Car(String model, String brand, double pricePerDay, int year, String fuelType) {
        super(model, brand, pricePerDay, year);
        this.fuelType = fuelType;
    }

    @Override
    void showDetails() {
        System.out.println("Car Model: " + model + ", Brand: " + brand + ", Year: " + year + ", Fuel Type: " + fuelType);
    }

    @Override
    double calculateRentalPrice(int days) {
        return pricePerDay * days;
    }
}