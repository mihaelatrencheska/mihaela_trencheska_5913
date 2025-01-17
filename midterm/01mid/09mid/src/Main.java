import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Library library = new Library();

        for(int i =0; i<3; i++){
            System.out.println("Enter details for Book" + (i+1) + ":");

            System.out.println("Enter title: ");
            String title= scanner.nextLine();

            System.out.println("Enter author: ");
            String author = scanner.nextLine();

            System.out.println("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Book book = new Book(title, author, price);
            library.addBook(book);
        }
        System.out.println("Books in the Library: ");
        library.displayAllBooks();

        scanner.close();

    }
}