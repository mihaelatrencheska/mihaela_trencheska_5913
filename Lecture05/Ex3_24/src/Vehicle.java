public class Vehicle {
    private String model;
    private int noPassengers;
    private double gasTankCapacity;
    private double fuelConsumption;
    public Vehicle(String model, int noPassengers, double gasTankCapacity, double fuelConsumption) {
        this.model = model;
        this.noPassengers = noPassengers;
        this.gasTankCapacity = gasTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }
    public double calculateDistance(){
        return gasTankCapacity / fuelConsumption;


    }
    public void compareRange(Vehicle vehicle2){
        if (this.calculateDistance() > vehicle2.calculateDistance()){
            System.out.println("Vehicle " + model + "has a greater range than" + vehicle2.model);
        } else if(this.calculateDistance() > vehicle2.calculateDistance()){
            System.out.println("Vehicle " + vehicle2.model + "has a greater range than" + model);
        } else {
            System.out.println("Vehicles have the same range.");
        }

    }

}