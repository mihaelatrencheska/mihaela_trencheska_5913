package library;

public class Book extends Publication{
    public String author;
    public String ISBN;
    public int pageCount;

    public Book(String author, String ISBN, int pageCount) {
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
    }

    public Book() {
    }
    @Override
    public void printDetails(){
        System.out.println("Author: "+ author);
        System.out.println("ISBN"+ ISBN);
        System.out.println("Number of pages: "+ pageCount);
    }

}
