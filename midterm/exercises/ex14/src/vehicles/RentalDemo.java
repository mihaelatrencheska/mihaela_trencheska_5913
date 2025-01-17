package vehicles;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Bike> bikes = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Car\n2. Add Bike\n3. Display All Vehicles\n4. Find Most Expensive Vehicle\n5. Calculate Rental Price\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter car model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter car brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter price per day: ");
                    double carPrice = scanner.nextDouble();
                    System.out.print("Enter car year: ");
                    int carYear = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter fuel type: ");
                    String fuelType = scanner.nextLine();
                    cars.add(new Car(carModel, carBrand, carPrice, carYear, fuelType));
                    break;

                case 2:
                    System.out.print("Enter bike model: ");
                    String bikeModel = scanner.nextLine();
                    System.out.print("Enter bike brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.print("Enter price per day: ");
                    double bikePrice = scanner.nextDouble();
                    System.out.print("Enter bike year: ");
                    int bikeYear = scanner.nextInt();
                    System.out.print("Enter gear count: ");
                    int gearCount = scanner.nextInt();
                    bikes.add(new Bike(bikeModel, bikeBrand, bikePrice, bikeYear, gearCount));
                    break;

                case 3:
                    System.out.println("\nCars:");
                    for (Car car : cars) {
                        car.showDetails();
                    }
                    System.out.println("\nBikes:");
                    for (Bike bike : bikes) {
                        bike.showDetails();
                    }
                    break;

                case 4:
                    Vehicle mostExpensive = null;
                    double maxPrice = 0;
                    for (Car car : cars) {
                        if (car.pricePerDay > maxPrice) {
                            mostExpensive = car;
                            maxPrice = car.pricePerDay;
                        }
                    }
                    for (Bike bike : bikes) {
                        if (bike.pricePerDay > maxPrice) {
                            mostExpensive = bike;
                            maxPrice = bike.pricePerDay;
                        }
                    }
                    System.out.println("Most expensive vehicle to rent: ");
                    mostExpensive.showDetails();
                    break;

                case 5:
                    System.out.print("Enter number of days: ");
                    int days = scanner.nextInt();
                    System.out.print("Enter vehicle type (1 for Car, 2 for Bike): ");
                    int vehicleType = scanner.nextInt();
                    if (vehicleType == 1) {
                        System.out.print("Enter car index: ");
                        int carIndex = scanner.nextInt();
                        System.out.println("Rental price: " + cars.get(carIndex).calculateRentalPrice(days));
                    } else if (vehicleType == 2) {
                        System.out.print("Enter bike index: ");
                        int bikeIndex = scanner.nextInt();
                        System.out.println("Rental price: " + bikes.get(bikeIndex).calculateRentalPrice(days));
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}