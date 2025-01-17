package store;

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price, "Clothing");
    }

    @Override
    public void printDetails() {
        System.out.println("Clothing: " + super.getCategory() + ", Price: " + getPrice());
    }
}
