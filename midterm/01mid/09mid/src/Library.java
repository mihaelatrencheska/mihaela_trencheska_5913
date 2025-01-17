import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayAllBooks(){
        System.out.println("All books in the library: ");
        for(int i = 0; i<books.size(); i++){
            System.out.println("Book " + (i+1) + ":");
            books.get(i).displayBookDetails();
            System.out.println();
        }
    }


}
