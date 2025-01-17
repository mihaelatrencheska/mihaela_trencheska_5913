package food;

public class MainDish extends MenuItem {
    private int cookTime;  // in minutes
    private boolean isVegetarian;

    // Constructor with parameters
    public MainDish(String name, String category, double price, int calories, int cookTime, boolean isVegetarian) {
        super(name, category, price, calories);
        this.cookTime = cookTime;
        this.isVegetarian = isVegetarian;
    }

    // Constructor without parameters
    public MainDish() {
        super();
        this.cookTime = 0;
        this.isVegetarian = false;
    }

    @Override
    public void printDetails() {
        System.out.println("Main Dish - Name: " + name + ", Category: " + category + ", Price: $" + price +
                ", Calories: " + calories + ", Cook Time: " + cookTime + " minutes, Vegetarian: " + isVegetarian);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public int getCookTime() {
        return cookTime;
    }
}
