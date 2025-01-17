import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Create lists to store menu items
        List<food.MainDish> mainDishes = new ArrayList<>();
        List<food.Dessert> desserts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Main Dish");
            System.out.println("2. Add Dessert");
            System.out.println("3. Display all menu items");
            System.out.println("4. Find item with longest cook time");
            System.out.println("5. Find most expensive item");
            System.out.println("6. Calculate average price");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mainDishes.add(new food.MainDish("Steak", "Meat", 25.99, 800, 20, false));
                    mainDishes.add(new food.MainDish("Vegetable Curry", "Indian", 15.99, 500, 30, true));
                    break;
                case 2:
                    desserts.add(new food.Dessert("Chocolate Cake", "Cake", 8.99, 400, 35, false));
                    desserts.add(new food.Dessert("Almond Pie", "Pie", 7.99, 350, 25, true));
                    break;
                case 3:
                    for (food.MainDish mainDish : mainDishes) {
                        mainDish.printDetails();
                    }
                    for (food.Dessert dessert : desserts) {
                        dessert.printDetails();
                    }
                    break;
                case 4:
                    food.MainDish longestCookTimeDish = mainDishes.get(0); // Start with the first dish
                    for (food.MainDish mainDish : mainDishes) {
                        if (mainDish.cookTime > longestCookTimeDish.cookTime) {
                            longestCookTimeDish = mainDish;
                        }
                    }
                    System.out.println("Item with longest cook time:");
                    longestCookTimeDish.printDetails();
                    break;
                case 5:
                    food.MenuItem mostExpensiveItem = !mainDishes.isEmpty() ? mainDishes.get(0) : desserts.get(0);
                    for (food.MainDish mainDish : mainDishes) {
                        if (mainDish.price > mostExpensiveItem.price) {
                            mostExpensiveItem = mainDish;
                        }
                    }
                    for (food.Dessert dessert : desserts) {
                        if (dessert.price > mostExpensiveItem.price) {
                            mostExpensiveItem = dessert;
                        }
                    }
                    System.out.println("Most expensive item:");
                    mostExpensiveItem.printDetails();
                    break;
                case 6:
                    double total = 0;
                    int count = 0;
                    for (food.MainDish mainDish : mainDishes) {
                        total += mainDish.price;
                        count++;
                    }
                    for (food.Dessert dessert : desserts) {
                        total += dessert.price;
                        count++;
                    }
                    double averagePrice = total / count;
                    System.out.println("Average price: $" + averagePrice);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



