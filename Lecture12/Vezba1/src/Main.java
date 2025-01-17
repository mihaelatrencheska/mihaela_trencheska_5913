import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;

        try {
            while (true) {
                System.out.println("Enter some choice: ");
                System.out.println("1- Input SFBook");
                System.out.println("2- Input AdventureBook");
                System.out.println("3- List all books");
                System.out.println("4- List the oldest book");
                System.out.println("5- The most expensive book");
                System.out.println("6- Average price of all books");
                System.out.println("7- Exit");
                choice = Integer.parseInt(bufferedReader.readLine());

                switch (choice) {
                    case 1:
                        // Input for SFBook
                        System.out.println("Enter SF title: ");
                        String sfTitle = bufferedReader.readLine();
                        System.out.println("Enter SF author: ");
                        String sfAuthor = bufferedReader.readLine();
                        System.out.println("Enter SF publish year: ");
                        int sfPublishYear = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter SF language: ");
                        String sfLanguage = bufferedReader.readLine();
                        System.out.println("Is it a best seller? (true/false): ");
                        boolean sfBestSeller = Boolean.parseBoolean(bufferedReader.readLine());
                        System.out.println("Enter SF price: ");
                        double sfPrice = Double.parseDouble(bufferedReader.readLine());

                        SFBook sfBook = new SFBook(sfTitle, sfAuthor, sfPrice, sfLanguage, sfPublishYear, sfBestSeller);
                        books.add(sfBook);
                        break;

                    case 2:
                        // Input for AdventureBook
                        System.out.println("Enter Adventure title: ");
                        String adventureTitle = bufferedReader.readLine();
                        System.out.println("Enter Adventure author: ");
                        String adventureAuthor = bufferedReader.readLine();
                        System.out.println("Enter Adventure publish year: ");
                        int adventurePublishYear = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Is the Adventure book illustrated? (true/false): ");
                        boolean isIllustrated = Boolean.parseBoolean(bufferedReader.readLine());
                        System.out.println("Enter Adventure price: ");
                        double adventurePrice = Double.parseDouble(bufferedReader.readLine());

                        AdventureBook adventureBook = new AdventureBook(adventureTitle, adventureAuthor, adventurePrice, "English", adventurePublishYear, isIllustrated);
                        books.add(adventureBook);
                        break;

                    case 3:
                        // List all books
                        System.out.println("Listing all books:");
                        for (Book book : books) {
                            book.printAttributes();
                            System.out.println();
                        }
                        break;

                    case 4:
                        // Find the oldest book
                        Book oldestBook = null;
                        for (Book book : books) {
                            if (oldestBook == null || book.getPublishYear() < oldestBook.getPublishYear()) {
                                oldestBook = book;
                            }
                        }
                        if (oldestBook != null) {
                            System.out.println("Oldest book: ");
                            oldestBook.printAttributes();
                        } else {
                            System.out.println("No books available.");
                        }
                        break;

                    case 5:
                        // Find the most expensive book
                        Book mostExpensiveBook = null;
                        for (Book book : books) {
                            if (mostExpensiveBook == null || book.getPrice() > mostExpensiveBook.getPrice()) {
                                mostExpensiveBook = book;
                            }
                        }
                        if (mostExpensiveBook != null) {
                            System.out.println("Most expensive book: ");
                            mostExpensiveBook.printAttributes();
                        } else {
                            System.out.println("No books available.");
                        }
                        break;

                    case 6:
                        // Calculate the average price of all books
                        if (books.size() > 0) {
                            double totalPrice = 0;
                            for (Book book : books) {
                                totalPrice += book.getPrice();
                            }
                            double averagePrice = totalPrice / books.size();
                            System.out.println("Average price of all books: " + averagePrice);
                        } else {
                            System.out.println("No books available.");
                        }
                        break;

                    case 7:
                        // Exit
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


