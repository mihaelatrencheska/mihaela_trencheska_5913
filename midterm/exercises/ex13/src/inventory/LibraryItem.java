package inventory;

abstract class LibraryItem {
    String title;
    String author;
    int publicationYear;

    // Constructor with parameters
    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Default constructor
    public LibraryItem() {}

    // Abstract Methods
    public abstract void displayDetails();
    public abstract String getItemInfo();
}