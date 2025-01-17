public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Truck: "+ year + make + model+ ", Load Capacity" + loadCapacity + tons);
    }
}
