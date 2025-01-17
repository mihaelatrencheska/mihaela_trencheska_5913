package inventory;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create lists for Books and Magazines
        List<Book> books = new ArrayList<>();
        List<Magazine> magazines = new ArrayList<>();

        // Menu with operations
        while (true) {
            System.out.println("\nLibrary Menu Operations:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display all library items");
            System.out.println("4. Find the oldest item in the library");
            System.out.println("5. Find the book with the highest page count");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter Book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Book author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter Book publication year: ");
                    int bookYear = scanner.nextInt();
                    System.out.print("Enter Book page count: ");
                    int pageCount = scanner.nextInt();
                    books.add(new Book(bookTitle, bookAuthor, bookYear, pageCount));
                    break;

                case 2:
                    // Add Magazine
                    System.out.print("Enter Magazine title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter Magazine author: ");
                    String magazineAuthor = scanner.nextLine();
                    System.out.print("Enter Magazine publication year: ");
                    int magazineYear = scanner.nextInt();
                    System.out.print("Enter Magazine issue number: ");
                    int issueNumber = scanner.nextInt();
                    magazines.add(new Magazine(magazineTitle, magazineAuthor, magazineYear, issueNumber));
                    break;

                case 3:
                    // Display all library items
                    System.out.println("\nBooks:");
                    for (Book book : books) {
                        book.displayDetails();
                    }
                    System.out.println("\nMagazines:");
                    for (Magazine magazine : magazines) {
                        magazine.displayDetails();
                    }
                    break;

                case 4:
                    // Find the oldest item in the library
                    LibraryItem oldestItem = null;
                    int oldestYear = Integer.MAX_VALUE;
                    for (Book book : books) {
                        if (book.publicationYear < oldestYear) {
                            oldestItem = book;
                            oldestYear = book.publicationYear;
                        }
                    }
                    for (Magazine magazine : magazines) {
                        if (magazine.publicationYear < oldestYear) {
                            oldestItem = magazine;
                            oldestYear = magazine.publicationYear;
                        }
                    }
                    System.out.println("Oldest item: ");
                    oldestItem.displayDetails();
                    break;

                case 5:
                    // Find the book with the highest page count
                    Book largestBook = null;
                    int maxPages = 0;
                    for (Book book : books) {
                        if (book.pageCount > maxPages) {
                            largestBook = book;
                            maxPages = book.pageCount;
                        }
                    }
                    System.out.println("Book with the highest page count: ");
                    largestBook.displayDetails();
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}
