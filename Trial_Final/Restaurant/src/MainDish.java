package food;

public class MainDish extends food.MenuItem {
    private int cookTime;
    private boolean isVegetarian;

    public MainDish() {}

    public MainDish(String name, String category, double price, int calories, int cookTime, boolean isVegetarian) {
        super(name, category, price, calories);
        this.cookTime = cookTime;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
        System.out.println("Cook Time: " + cookTime);
        System.out.println("Vegetarian: " + isVegetarian);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getCookTime() {
        return cookTime;
    }
}

