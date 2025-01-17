package management;

public class FictionBook extends Book{
    private String genre;

    public FictionBook(String title, String author, double price, String isbn, String genre){
        super(title, author, price, isbn);
        this.genre = genre;
    }
     @Override
    public void printDetails(){
         System.out.println("Fiction Book: ");
         System.out.println("Title: "+title);
         System.out.println("Author: "+author);
         System.out.println("Price: $"+price);
         System.out.println("ISBN: "+ isbn);
         System.out.println("Genre: "+ genre);
         System.out.println();
     }

}
