
public class Main {
    public static void main(String[] args){

        Book book1 = new Book("Java Essentials", "Alice Johnson", 320);
        Book book2 = new Book("Data Structures", "Bob Johnson", 45);
        Book book3 = new Book("Algorithms 101", "Charlie Lee", 55);
        Book book4 = new Book("Learning Ai", "Bob Smith", 120);
        Book book5 = new Book("Effective Programming", "Carol White", 450);

        Book[] bookArray= {book1, book2, book3, book4, book5};

        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
        book4.displayBookInfo();
        book5.displayBookInfo();


    }
}