package management;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RestaurantDemo {
    public static void main(String[] args) {
        List<String> customerNames = Arrays.asList(
                "John Doe", "Jane Smith", "Alice Johnson", "Bob Brown", "Charlie White",
                "Diana Black", "Edward Green", "Fiona Blue", "George Yellow", "Hannah Red"
        );

        Random random = new Random();
        List<String> times = Arrays.asList("12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM");

        List<Reservation> reservations = customerNames.stream()
                .map(name -> {
                    String reservationID = "R-" + (1000 + random.nextInt(9000));
                    int tableNumber = 1 + random.nextInt(20);
                    String reservationTime = times.get(random.nextInt(times.size()));
                    return new Reservation(reservationID, name, tableNumber, reservationTime);
                })
                .collect(Collectors.toList());

        reservations.forEach(System.out::println);

        System.out.println("\nReservations for tables 10-15:");
        reservations.stream()
                .filter(reservation -> reservation.getTableNumber() >= 10 && reservation.getTableNumber() <= 15)
                .forEach(System.out::println);
    }
}