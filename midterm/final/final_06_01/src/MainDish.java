package food;
public class MainDish extends MenuItem {
    public int cookTime;
    public boolean isVegetarian;

    public MainDish(String name, String category, double price, int calories, int cookTime, boolean isVegetarian) {
        super(name, category, price, calories);
        this.cookTime = cookTime;
        this.isVegetarian = isVegetarian;
    }

    public MainDish(){
    }


    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $"+ price);
        System.out.println("Calories: "+ calories);
        System.out.println("CookTime: "+ cookTime + "minutes");
        System.out.println("Vegeterian: "+ (isVegetarian? "Yes": "No"));

    }

    @Override
    public double getPrice(){
        return price;
    }

}
