package management;

public class NonFictionBook extends Book {
    private String fieldOfStudy;

    public NonFictionBook(String title, String author, String isbn, double price, int availableCopies, String fieldOfStudy) {
        super(title, author, isbn, price, availableCopies);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    @Override
    public void printDetails() {
        System.out.println("Non-Fiction Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available Copies: " + getAvailableCopies());
        System.out.println("Field of Study: " + fieldOfStudy);
    }
}