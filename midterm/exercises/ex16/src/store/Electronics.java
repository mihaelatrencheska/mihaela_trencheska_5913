package store;

class Electronics extends Product {
    int warrantyPeriod;

    public Electronics(String name, String category, double price, int stock, int warrantyPeriod) {
        super(name, category, price, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayDetails() {
        System.out.println("Electronics: " + name + ", Category: " + category + ", Price: " + price + ", Stock: " + stock + ", Warranty Period: " + warrantyPeriod + " years");
    }

    @Override
    double getPrice() {
        return price;
    }
}
