package management;

public abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    protected String isbn;

    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    public abstract void printDetails();
    public double getPrice(){
        return price;
    }
}
