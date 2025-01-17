package store;

import java.util.ArrayList;
import java.util.List;

public class ShoppingDemo {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics("Laptop", 1200));
        cart.add(new Clothing("Jacket", 100));
        cart.add(new Grocery("Apple", 2));

        // Display all products
        cart.forEach(Product::printDetails);

        // Calculate total price
        double totalPrice = cart.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Total Price: " + totalPrice);

        // Filter products by category
        System.out.println("Filtered by Electronics:");
        cart.stream().filter(p -> p.getCategory().equals("Electronics")).forEach(Product::printDetails);
    }
}
