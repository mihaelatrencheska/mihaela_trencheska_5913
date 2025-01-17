package vehicles;

abstract class Vehicle {
    String model;
    String brand;
    double pricePerDay;
    int year;

    public Vehicle(String model, String brand, double pricePerDay, int year) {
        this.model = model;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.year = year;
    }

    abstract void showDetails();
    abstract double calculateRentalPrice(int days);
}
