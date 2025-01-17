package food;

public class MainDish extends MenuItem{
    private int cookTime;
    private boolean isVegetarian;

    public MainDish() {
    }

    public MainDish(String name, String category, double price, int calories, int cookTime, boolean isVegetarian) {
        super(name, category, price, calories);
        this.cookTime = cookTime;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void printDetails(){
        System.out.println("Main Dish: "+ name + ", Category" + category+ ", Price" + price + ", Calories"+ calories + "Cook Time" + cookTime + " mins, Vegetarian " + isVegetarian);
    }
    @Override
    public double getPrice(){
        return price;
    }
    public int getCookTime(){
        return cookTime;
    }
}
