public class Car {
    private String type;
    private int noSeats;
    private String fuelType;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayCar(){
        System.out.println("Car details: ");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("FuelType" + fuelType);
        System.out.println("Number seats" + noSeats);
    }

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public Car() {
        this.type= "Porsche";
        this.noSeats= 5;
        this.fuelType= "Gas";
        this.color= "Black";
    }
}
