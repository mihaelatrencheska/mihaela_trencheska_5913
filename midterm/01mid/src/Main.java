import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Enter details for 3 book:");
        for ( int i =0; i<3; i++){
            System.out.println("Enter title for Book "+ (i+1)+ ":");
            String title = scanner.nextLine();

            System.out.println("Enter Author fr Book "+ (i+1)+ ":");
            String author = scanner.nextLine();

            System.out.println("Enter price for Book  "+ (i+1)+ ":");
            double price = scanner.nextDouble();
            scanner.nextLine();

             Book book = new Book(title, author, price);
             library.addBook(book);
        }
        System.out.println("\nAll Books in Library");
        library.displayAllBooks();

        System.out.println("Enter the author to search for: ");
        String searchAuthor = scanner.nextLine();
        library.findBooksByAuthor(searchAuthor);

        System.out.println("Books before sorting by price: ");
        library.displayAllBooks();

        library.sortBooksByPrice();
        System.out.println("Books after sorting by price");
        library.displayAllBooks();

        scanner.close();
    }
}