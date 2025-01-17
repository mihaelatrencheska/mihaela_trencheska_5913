package food;

public class Dessert extends MenuItem {
    private int sugarContent;
    private boolean hasNuts;

    public Dessert(String name, String category, double price, int calories, int sugarContent, boolean hasNuts) {
        super(name, category, price, calories);
        this.sugarContent = sugarContent;
        this.hasNuts = hasNuts;
    }

    public Dessert() {
    }

    @Override
    public void printDetails(){
        System.out.println("Main Dish: "+ name + ", Category" + category+ ", Price" + price + ", Calories"+ calories + ",Sugar Content "+ sugarContent + "g,Contains Nuts "+ hasNuts);
    }
    @Override
    public double getPrice(){
        return price;
    }
}
