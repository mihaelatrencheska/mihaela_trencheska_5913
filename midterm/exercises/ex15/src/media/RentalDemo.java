package media;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ActionMovie> actionMovies = new ArrayList<>();
        ArrayList<ComedyMovie> comedyMovies = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Action Movie\n2. Add Comedy Movie\n3. Display All Movies\n4. Find Longest Movie\n5. Find Most Expensive Movie\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter action movie title: ");
                    String actionTitle = scanner.nextLine();
                    System.out.print("Enter director: ");
                    String actionDirector = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    int actionDuration = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double actionPrice = scanner.nextDouble();
                    System.out.print("Enter number of stunts: ");
                    int stuntsCount = scanner.nextInt();
                    actionMovies.add(new ActionMovie(actionTitle, actionDirector, actionDuration, actionPrice, stuntsCount));
                    break;

                case 2:
                    System.out.print("Enter comedy movie title: ");
                    String comedyTitle = scanner.nextLine();
                    System.out.print("Enter director: ");
                    String comedyDirector = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    int comedyDuration = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double comedyPrice = scanner.nextDouble();
                    System.out.print("Enter number of jokes: ");
                    int jokesCount = scanner.nextInt();
                    comedyMovies.add(new ComedyMovie(comedyTitle, comedyDirector, comedyDuration, comedyPrice, jokesCount));
                    break;

                case 3:
                    System.out.println("\nAction Movies:");
                    for (ActionMovie movie : actionMovies) {
                        movie.printDetails();
                    }
                    System.out.println("\nComedy Movies:");
                    for (ComedyMovie movie : comedyMovies) {
                        movie.printDetails();
                    }
                    break;

                case 4:
                    Movie longestMovie = null;
                    int maxDuration = 0;
                    for (ActionMovie movie : actionMovies) {
                        if (movie.duration > maxDuration) {
                            longestMovie = movie;
                            maxDuration = movie.duration;
                        }
                    }
                    for (ComedyMovie movie : comedyMovies) {
                        if (movie.duration > maxDuration) {
                            longestMovie = movie;
                            maxDuration = movie.duration;
                        }
                    }
                    System.out.println("Longest movie: ");
                    longestMovie.printDetails();
                    break;

                case 5:
                    Movie mostExpensiveMovie = null;
                    double maxPrice = 0;
                    for (ActionMovie movie : actionMovies) {
                        if (movie.price > maxPrice) {
                            mostExpensiveMovie = movie;
                            maxPrice = movie.price;
                        }
                    }
                    for (ComedyMovie movie : comedyMovies) {
                        if (movie.price > maxPrice) {
                            mostExpensiveMovie = movie;
                            maxPrice = movie.price;
                        }
                    }
                    System.out.println("Most expensive movie: ");
                    mostExpensiveMovie.printDetails();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}