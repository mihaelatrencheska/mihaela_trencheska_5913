package food;

public class Dessert extends MenuItem {
    private int sugarContent;  // in grams
    private boolean hasNuts;

    // Constructor with parameters
    public Dessert(String name, String category, double price, int calories, int sugarContent, boolean hasNuts) {
        super(name, category, price, calories);
        this.sugarContent = sugarContent;
        this.hasNuts = hasNuts;
    }

    // Constructor without parameters
    public Dessert() {
        super();
        this.sugarContent = 0;
        this.hasNuts = false;
    }

    @Override
    public void printDetails() {
        System.out.println("Dessert - Name: " + name + ", Category: " + category + ", Price: $" + price +
                ", Calories: " + calories + ", Sugar Content: " + sugarContent + "g, Has Nuts: " + hasNuts);
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
