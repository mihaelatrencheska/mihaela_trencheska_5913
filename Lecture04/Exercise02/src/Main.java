
public class Main {

    public static void main(String[] args) {
     //   Car car= new Car("BMW", 5, "Gas", "Red");
        // Car car2 =new Car();

      //  car2.setNoSeats(2);
      //  car2.setFuelType("Electric");
      //  car2.setColor("Blue");

      //  car.displayCar();;
      //  car2.displayCar();

        Car[] cars = new Car[5];
        cars[0]= new Car("Porsche",6, "Gas", "Black" );
        cars[1]= new Car();
        cars[2]= new Car("BMW", 4, "Gas", "pink");
        cars[3]= new Car();
        cars[4]= new Car("Mercedes", 5, "Gas", "white");


        for (Car car: cars){
            car.displayCar();
        }
        Car maxSeatsCar= cars[0];
        for(int i = 1 ; i<cars.length; i++){
            if(maxSeatsCar.getNoSeats()< cars[i].getNoSeats()){
                maxSeatsCar= cars[i];

            }
        }
        System.out.println("Car with max number of seats: ");
        maxSeatsCar.displayCar();
    }
}