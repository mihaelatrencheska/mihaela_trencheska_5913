package store;

abstract class Product {
    String name;
    String category;
    double price;
    int stock;

    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    abstract void displayDetails();
    abstract double getPrice();
}
