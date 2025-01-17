package store;

public class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price, "Grocery");
    }

    @Override
    public void printDetails() {
        System.out.println("Grocery: " + super.getCategory() + ", Price: " + getPrice());
    }
}

