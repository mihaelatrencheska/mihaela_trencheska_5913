package food;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<MainDish>mainDishes= new ArrayList<>();
        List<Dessert>desserts= new ArrayList<>();

        while(true){
            System.out.println("Menu options: ");
            System.out.println("1.Add Main Dish");
            System.out.println("2.Add Dessert");
            System.out.println("3.Display all menu items");
            System.out.println("4.Find item with longest cook time");
            System.out.println("5.Find most expensive item ");
            System.out.println("6.Calculate Average price");
            System.out.println("7.Exit");
            System.out.println("-Choose an option( 1-7 )-");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1-> {
                    System.out.println("Enter Main Dish Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Category: ");
                    String category= scanner.nextLine();
                    System.out.println("Enter Price: ");
                    double price= scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Calories: ");
                    int calories= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Cook Time: ");
                    int cookTime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Is Vegetarian(true/false: ");
                    boolean isVegetarian = scanner.nextBoolean();
                    scanner.nextLine();
                    mainDishes.add(new MainDish(name, category, price, calories, cookTime, isVegetarian));
                    break;

                }
                case 2->{
                    System.out.println("Enter Dessert Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Category: ");
                    String category= scanner.nextLine();
                    System.out.println("Enter Price: ");
                    double price= scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Calories: ");
                    int calories= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter sugar intake: ");
                    int sugarContent= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Contains nuts- true or false");
                    boolean hasNuts= scanner.nextBoolean();
                    scanner.nextLine();
                    desserts.add(new Dessert(name, category,price,calories,sugarContent, hasNuts));
                    break;
                }
                case 3->{
                    System.out.println("Menu Dishes: ");
                    for( MainDish dish : mainDishes){
                        dish.printDetails();
                    }
                    System.out.println("Desserts: ");
                    for (Dessert dessert : desserts){
                        dessert.printDetails();
                        break;
                    }
                }
                case 4->{
                    MainDish longestCook= mainDishes.stream()
                            .max((a,b)-> Integer.compare(a.getCookTime(), b.getCookTime()))
                            .orElse(null);
                    if( longestCook != null){
                        System.out.println("Main dish with longest cook time: ");
                        longestCook.printDetails();
                    }else {
                        System.out.println("No main dishes available");
                    }
                    break;
                }
                case 5->{
                    MenuItem mostExpensive = null;
                    double maxPrice = 0;
                    for ( MainDish dish : mainDishes){
                        if(dish.getPrice() > maxPrice){
                            maxPrice = dish.getPrice();
                            mostExpensive= dish;
                        }
                    }
                    for(Dessert dessert : desserts){
                        if (dessert.getPrice()> maxPrice){
                            maxPrice = dessert.getPrice();
                            mostExpensive= dessert;
                        }
                    }
                    if(mostExpensive != null){
                        System.out.println("Most expensive item");
                        mostExpensive.printDetails();
                    }else {
                        System.out.println("no items available");
                    }
                    break;
                }
                case 6->{
                    double totalPrice = 0;
                    int count = 0;
                    for(MainDish dish: mainDishes){
                        totalPrice += dish.getPrice();
                        count ++;
                    }
                    for (Dessert dessert: desserts){
                        totalPrice += dessert.getPrice();
                        count++;
                    }
                    if(count >0){
                        System.out.println("Average price: "+ (totalPrice/count));

                    }else{
                        System.out.println("No items available");
                    }
                    break;
                }
                case 7->{
                    System.out.println("Exiting..");
                    return;
                }
                default -> System.out.println("Invalid choice");

            }
        }


    }
}
