public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void applyDiscount(double percentage){
        price+=((price * percentage)/10);

    }
    public void displayBookInfo(){
        System.out.println("Book: " + title + " by " + author +", Price: "+ price + " $");
    }
}
