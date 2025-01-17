public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota Corolla",50,50.0,7.5);
        Vehicle vehicle2 = new Vehicle("Porsche", 4, 8.0, 5.6);

        System.out.println(vehicle1.calculateDistance());
        System.out.println(vehicle2.calculateDistance());

        vehicle1.compareRange(vehicle2);
        vehicle2.compareRange(vehicle1);
    }
}
