import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Method to add a book to the list
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books
    public void displayAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book " + (i + 1) + ":");
            books.get(i).displayBookDetails();
            System.out.println();
        }
    }

    // Method to search for books by a specific author
    public void findBooksByAuthor(String author) {
        System.out.println("Books by " + author + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Price: " + book.getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author " + author);
        }
        System.out.println();
    }

    // Method to sort books by price in ascending order
    public void sortBooksByPrice() {
        books.sort(Comparator.comparingDouble(Book::getPrice));
    }
}
