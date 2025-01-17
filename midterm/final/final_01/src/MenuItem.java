package food;

public abstract class MenuItem {
    protected String name;
    protected String category;
    protected double price;
    protected int calories;

    // Constructor with parameters
    public MenuItem(String name, String category, double price, int calories) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.calories = calories;
    }

    // Constructor without parameters
    public MenuItem() {
        this.name = "Unknown";
        this.category = "Unknown";
        this.price = 0.0;
        this.calories = 0;
    }

    // Abstract methods
    public abstract void printDetails();
    public abstract double getPrice();
}
