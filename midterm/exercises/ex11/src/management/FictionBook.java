package management;

public class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String isbn, double price, int availableCopies, String genre) {
        super(title, author, isbn, price, availableCopies);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void printDetails() {
        System.out.println("Fiction Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available Copies: " + getAvailableCopies());
        System.out.println("Genre: " + genre);
    }
}