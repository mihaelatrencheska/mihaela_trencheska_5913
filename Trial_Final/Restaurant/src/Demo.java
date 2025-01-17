package food;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    private static List<food.MainDish> mainDishes = new ArrayList<>();
    private static List<food.Dessert> desserts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Main Dish");
            System.out.println("2. Add Dessert");
            System.out.println("3. Display all menu items");
            System.out.println("4. Find item with longest cook time");
            System.out.println("5. Find most expensive item");
            System.out.println("6. Calculate average price");
            System.out.println("7. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMainDish(scanner);
                    break;
                case 2:
                    addDessert(scanner);
                    break;
                case 3:
                    displayAllMenuItems();
                    break;
                case 4:
                    findItemWithLongestCookTime();
                    break;
                case 5:
                    findMostExpensiveItem();
                    break;
                case 6:
                    calculateAveragePrice();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }

    private static void addMainDish(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter calories: ");
        int calories = scanner.nextInt();
        System.out.print("Enter cook time: ");
        int cookTime = scanner.nextInt();
        System.out.print("Is vegetarian (true/false): ");
        boolean isVegetarian = scanner.nextBoolean();
        scanner.nextLine();

        food.MainDish mainDish = new food.MainDish(name, category, price, calories, cookTime, isVegetarian);
        mainDishes.add(mainDish);
        System.out.println("Main Dish added successfully.");
    }

    private static void addDessert(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter calories: ");
        int calories = scanner.nextInt();
        System.out.print("Enter sugar content: ");
        int sugarContent = scanner.nextInt();
        System.out.print("Has nuts (true/false): ");
        boolean hasNuts = scanner.nextBoolean();
        scanner.nextLine();

        food.Dessert dessert = new food.Dessert(name, category, price, calories, sugarContent, hasNuts);
        desserts.add(dessert);
        System.out.println("Dessert added successfully.");
    }

    private static void displayAllMenuItems() {
        System.out.println("Main Dishes:");
        for (food.MainDish mainDish : mainDishes) {
            mainDish.printDetails();
            System.out.println();
        }

        System.out.println("Desserts:");
        for (food.Dessert dessert : desserts) {
            dessert.printDetails();
            System.out.println();
        }
    }

    private static void findItemWithLongestCookTime() {
        if (mainDishes.isEmpty()) {
            System.out.println("No main dishes available.");
            return;
        }

        food.MainDish longestCookTimeDish = mainDishes.get(0);
        for (food.MainDish mainDish : mainDishes) {
            if (mainDish.getCookTime() > longestCookTimeDish.getCookTime()) {
                longestCookTimeDish = mainDish;
            }
        }

        System.out.println("Item with longest cook time:");
        longestCookTimeDish.printDetails();
    }

    private static void findMostExpensiveItem() {
        food.MenuItem mostExpensiveItem = null;
        double maxPrice = 0;

        for (food.MainDish mainDish : mainDishes) {
            if (mainDish.getPrice() > maxPrice) {
                maxPrice = mainDish.getPrice();
                mostExpensiveItem = mainDish;
            }
        }

        for (food.Dessert dessert : desserts) {
            if (dessert.getPrice() > maxPrice) {
                maxPrice = dessert.getPrice();
                mostExpensiveItem = dessert;
            }
        }

        if (mostExpensiveItem != null) {
            System.out.println("Most expensive item:");
            mostExpensiveItem.printDetails();
        } else {
            System.out.println("No items available.");
        }
    }

    private static void calculateAveragePrice() {
        double totalPrice = 0;
        int itemCount = 0;

        for (food.MainDish mainDish : mainDishes) {
            totalPrice += mainDish.getPrice();
            itemCount++;
        }

        for (food.Dessert dessert : desserts) {
            totalPrice += dessert.getPrice();
            itemCount++;
        }

        if (itemCount > 0) {
            double averagePrice = totalPrice / itemCount;
            System.out.println("Average price: " + averagePrice);
        } else {
            System.out.println("No items available.");
        }
    }
}
