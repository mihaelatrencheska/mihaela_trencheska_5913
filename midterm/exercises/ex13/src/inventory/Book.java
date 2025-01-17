package inventory;

class Book extends LibraryItem {
    int pageCount;

    // Constructor with parameters
    public Book(String title, String author, int publicationYear, int pageCount) {
        super(title, author, publicationYear);
        this.pageCount = pageCount;
    }

    // Default constructor
    public Book() {}

    // Implementing abstract methods
    @Override
    public void displayDetails() {
        System.out.println("Book: " + title + " | Author: " + author + " | Year: " + publicationYear + " | Pages: " + pageCount);
    }

    @Override
    public String getItemInfo() {
        return "Book: " + title + " | Author: " + author;
    }
}
