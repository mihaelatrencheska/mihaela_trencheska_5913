package store;

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price, "Electronics");
    }

    @Override
    public void printDetails() {
        System.out.println("Electronics: " + super.getCategory() + ", Price: " + getPrice());
    }
}

