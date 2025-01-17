package food;

public class Dessert extends food.MenuItem {
    private int sugarContent;
    private boolean hasNuts;

    public Dessert() {}

    public Dessert(String name, String category, double price, int calories, int sugarContent, boolean hasNuts) {
        super(name, category, price, calories);
        this.sugarContent = sugarContent;
        this.hasNuts = hasNuts;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
        System.out.println("Sugar Content: " + sugarContent);
        System.out.println("Has Nuts: " + hasNuts);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
