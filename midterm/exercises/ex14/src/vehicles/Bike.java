package vehicles;

class Bike extends Vehicle {
    int gearCount;

    public Bike(String model, String brand, double pricePerDay, int year, int gearCount) {
        super(model, brand, pricePerDay, year);
        this.gearCount = gearCount;
    }

    @Override
    void showDetails() {
        System.out.println("Bike Model: " + model + ", Brand: " + brand + ", Year: " + year + ", Gear Count: " + gearCount);
    }

    @Override
    double calculateRentalPrice(int days) {
        return pricePerDay * days;
    }
}

