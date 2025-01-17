package management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Find books by author");
            System.out.println("4. Find the most expensive book");
            System.out.println("5. Calculate total available copies");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book type (Fiction/Non-Fiction): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter available copies: ");
                    int copies = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (type.equalsIgnoreCase("Fiction")) {
                        System.out.print("Enter genre: ");
                        String genre = scanner.nextLine();
                        books.add(new FictionBook(title, author, isbn, price, copies, genre));
                    } else if (type.equalsIgnoreCase("Non-Fiction")) {
                        System.out.print("Enter field of study: ");
                        String fieldOfStudy = scanner.nextLine();
                        books.add(new NonFictionBook(title, author, isbn, price, copies, fieldOfStudy));
                    } else {
                        System.out.println("Invalid book type!");
                    }
                    break;

                case 2:
                    System.out.println("\nBook List:");
                    for (Book book : books) {
                        book.printDetails();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter author name: ");
                    String searchAuthor = scanner.nextLine();
                    System.out.println("\nBooks by " + searchAuthor + ":");
                    for (Book book : books) {
                        if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                            book.printDetails();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    Book expensiveBook = null;
                    for (Book book : books) {
                        if (expensiveBook == null || book.getPrice() > expensiveBook.getPrice()) {
                            expensiveBook = book;
                        }
                    }
                    if (expensiveBook != null) {
                        System.out.println("\nMost Expensive Book:");
                        expensiveBook.printDetails();
                    }
                    break;

                case 5:
                    int totalCopies = 0;
                    for (Book book : books) {
                        totalCopies += book.getAvailableCopies();
                    }
                    System.out.println("\nTotal Available Copies: " + totalCopies);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}