package food;

public abstract class MenuItem {
    protected String name;
    protected String category;
    protected double price;
    protected int calories;

    public MenuItem() {}

    public MenuItem(String name, String category, double price, int calories) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.calories = calories;
    }

    public abstract void printDetails();
    public abstract double getPrice();
}

