package management;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        List<Book>books = new ArrayList<>();

        books.add(new FictionBook("The Hobbit", "J.R.R. Tolkien", 15.99, "978-0547928227", "Fantasy"));
        books.add(new FictionBook("Dune", "Frank Herbert", 18.99, "978-0441172719", "Science Fiction"));

        books.add(new NonFictionBook("Sapiens", "Yuval Noah Harari", 22.50, "978-0062316110", "History"));
        books.add(new NonFictionBook("Educated", "Tara Westover", 20.00, "978-0399590504", "Memoir"));

        System.out.println("All Books:");
        books.forEach(Book::printDetails);

        Book mostExpensiveBook = books.stream()
                .max(Comparator.comparingDouble(Book::getPrice))
                .orElse(null);
        if (mostExpensiveBook != null) {
            System.out.println("Most Expensive Book:");
            mostExpensiveBook.printDetails();
        }
        System.out.println("Fiction Books:");
        books.stream()
                .filter(book -> book instanceof FictionBook)
                .forEach(Book::printDetails);

        System.out.println("Non-Fiction Books:");
        books.stream()
                .filter(book -> book instanceof NonFictionBook)
                .forEach(Book::printDetails);


    }
}

