package management;

public abstract class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int availableCopies;

    public Book(String title, String author, String isbn, double price, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public abstract void printDetails();
}