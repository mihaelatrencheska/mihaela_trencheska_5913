import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a year, or 'STOP' to exit");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("STOP")) {
                System.out.println("you are leaving time travel machine, good luck!");
                break;

            }
            try {
                int year = Integer.parseInt(input);
                if (isLeapYear(year)) {
                    System.out.println("The year is leap");
                } else {
                    System.out.println("Not leap year!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid year");
            }
        }
        public static boolean isLeapYear ( int year){
            if (year % 4 != 0) {
                return false;
            } else if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else return false;
        }
    }
