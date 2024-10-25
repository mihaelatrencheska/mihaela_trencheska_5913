public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4);

        car.startEngine();
        car.inflateWheels(2);
        car.deflateWheels(2);

        car.openTrunk();
        car.openAllDoors();


    }
}