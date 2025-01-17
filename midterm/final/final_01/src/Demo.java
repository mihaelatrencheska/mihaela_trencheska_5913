package food;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<food.MainDish> mainDishes = new ArrayList<>();
        List<food.Dessert> desserts = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Main Dish");
            System.out.println("2. Add Dessert");
            System.out.println("3. Display all menu items");
            System.out.println("4. Find item with longest cook time");
            System.out.println("5. Find most expensive item");
            System.out.println("6. Calculate average price");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1: {
                    System.out.print("Enter Main Dish name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter calories: ");
                    int calories = scanner.nextInt();
                    System.out.print("Enter cook time (in minutes): ");
                    int cookTime = scanner.nextInt();
                    System.out.print("Is it vegetarian (true/false): ");
                    boolean isVegetarian = scanner.nextBoolean();
                    scanner.nextLine();  // Consume newline

                    MainDish mainDish = new MainDish(name, category, price, calories, cookTime, isVegetarian);
                    mainDishes.add(mainDish);
                    break;
                }
                case 2: {
                    System.out.print("Enter Dessert name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter calories: ");
                    int calories = scanner.nextInt();
                    System.out.print("Enter sugar content (in grams): ");
                    int sugarContent = scanner.nextInt();
                    System.out.print("Does it have nuts (true/false): ");
                    boolean hasNuts = scanner.nextBoolean();
                    scanner.nextLine();  // Consume newline

                    Dessert dessert = new Dessert(name, category, price, calories, sugarContent, hasNuts);
                    desserts.add(dessert);
                    break;
                }
                case 3: {
                    System.out.println("\nMain Dishes:");
                    for (MainDish dish : mainDishes) {
                        dish.printDetails();
                    }
                    System.out.println("\nDesserts:");
                    for (Dessert dessert : desserts) {
                        dessert.printDetails();
                    }
                    break;
                }
                case 4: {
                    MainDish longestCookTimeDish = mainDishes.stream()
                            .max((dish1, dish2) -> Integer.compare(dish1.getCookTime(), dish2.getCookTime()))
                            .orElse(null);
                    if (longestCookTimeDish != null) {
                        longestCookTimeDish.printDetails();
                    } else {
                        System.out.println("No Main Dishes available.");
                    }
                    break;
                }
                case 5: {
                    MenuItem mostExpensiveItem = null;
                    double maxPrice = 0;

                    for (MainDish dish : mainDishes) {
                        if (dish.getPrice() > maxPrice) {
                            maxPrice = dish.getPrice();
                            mostExpensiveItem = dish;
                        }
                    }

                    for (Dessert dessert : desserts) {
                        if (dessert.getPrice() > maxPrice) {
                            maxPrice = dessert.getPrice();
                            mostExpensiveItem = dessert;
                        }
                    }

                    if (mostExpensiveItem != null) {
                        mostExpensiveItem.printDetails();
                    } else {
                        System.out.println("No items available.");
                    }
                    break;
                }
                case 6: {
                    double totalPrice = 0;
                    int totalCount = 0;

                    for (MainDish dish : mainDishes) {
                        totalPrice += dish.getPrice();
                        totalCount++;
                    }

                    for (Dessert dessert : desserts) {
                        totalPrice += dessert.getPrice();
                        totalCount++;
                    }

                    if (totalCount > 0) {
                        System.out.println("Average Price: $" + (totalPrice / totalCount));
                    } else {
                        System.out.println("No items available.");
                    }
                    break;
                }
                case 7: {
                    running = false;
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

