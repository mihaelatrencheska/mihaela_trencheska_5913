package management;

public class NonFictionBook extends Book{
    private String subject;

    public NonFictionBook(String title, String author, double price, String isbn,String subject){
        super(title, author, price, isbn);
        this.subject= subject;
    }
    @Override
    public void printDetails(){
        System.out.println("Non-Fiction Book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Subject: " + subject);
        System.out.println();

    }
}
