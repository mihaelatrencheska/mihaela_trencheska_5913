package store;

class Clothing extends Product {
    String size;
    String material;

    public Clothing(String name, String category, double price, int stock, String size, String material) {
        super(name, category, price, stock);
        this.size = size;
        this.material = material;
    }

    @Override
    void displayDetails() {
        System.out.println("Clothing: " + name + ", Category: " + category + ", Price: " + price + ", Stock: " + stock + ", Size: " + size + ", Material: " + material);
    }

    @Override
    double getPrice() {
        return price;
    }
}
