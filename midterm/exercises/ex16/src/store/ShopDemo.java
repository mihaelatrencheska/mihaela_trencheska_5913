package store;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Electronics> electronicsList = new ArrayList<>();
        ArrayList<Clothing> clothingList = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Electronics\n2. Add Clothing\n3. Display All Products\n4. Find Product with Highest Stock\n5. Calculate Total Value of All Products\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter electronics name: ");
                    String electronicsName = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String electronicsCategory = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double electronicsPrice = scanner.nextDouble();
                    System.out.print("Enter stock: ");
                    int electronicsStock = scanner.nextInt();
                    System.out.print("Enter warranty period (years): ");
                    int warrantyPeriod = scanner.nextInt();
                    electronicsList.add(new Electronics(electronicsName, electronicsCategory, electronicsPrice, electronicsStock, warrantyPeriod));
                    break;

                case 2:
                    System.out.print("Enter clothing name: ");
                    String clothingName = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String clothingCategory = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double clothingPrice = scanner.nextDouble();
                    System.out.print("Enter stock: ");
                    int clothingStock = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter size: ");
                    String size = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String material = scanner.nextLine();
                    clothingList.add(new Clothing(clothingName, clothingCategory, clothingPrice, clothingStock, size, material));
                    break;

                case 3:
                    System.out.println("\nElectronics:");
                    for (Electronics product : electronicsList) {
                        product.displayDetails();
                    }
                    System.out.println("\nClothing:");
                    for (Clothing product : clothingList) {
                        product.displayDetails();
                    }
                    break;

                case 4:
                    Product highestStockProduct = null;
                    int maxStock = 0;
                    for (Electronics product : electronicsList) {
                        if (product.stock > maxStock) {
                            highestStockProduct = product;
                            maxStock = product.stock;
                        }
                    }
                    for (Clothing product : clothingList) {
                        if (product.stock > maxStock) {
                            highestStockProduct = product;
                            maxStock = product.stock;
                        }
                    }
                    System.out.println("Product with highest stock: ");
                    highestStockProduct.displayDetails();
                    break;

                case 5:
                    double totalValue = 0;
                    for (Electronics product : electronicsList) {
                        totalValue += product.getPrice() * product.stock;
                    }
                    for (Clothing product : clothingList) {
                        totalValue += product.getPrice() * product.stock;
                    }
                    System.out.println("Total value of all products in stock: " + totalValue);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}