package management;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryDemo {
    public static void main(String[] args) {
        List<String> bookDetails = Arrays.asList(
                "1984 by George Orwell", "The Great Gatsby by F. Scott Fitzgerald",
                "Moby Dick by Herman Melville", "Pride and Prejudice by Jane Austen",
                "The Catcher in the Rye by J.D. Salinger"
        );

        List<Book> books = bookDetails.stream().map(details -> {
            String[] parts = details.split(" by ");
            String title = parts[0];
            String author = parts[1];
            String isbn = "ISBN-" + (int) (Math.random() * 9000 + 1000);
            int copies = (int) (Math.random() * 10 + 1);
            return new Book(isbn, title, author, copies);
        }).collect(Collectors.toList());

        books.forEach(System.out::println);

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getCopiesAvailable() > 5)
                .collect(Collectors.toList());

        System.out.println("\nBooks with more than 5 copies available:");
        filteredBooks.forEach(System.out::println);
    }
}
