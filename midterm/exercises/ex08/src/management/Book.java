package management;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int copiesAvailable;

    public Book(String isbn, String title, String author, int copiesAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getCopiesAvailable() { return copiesAvailable; }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Copies Available=" + copiesAvailable +
                '}';
    }
}