public abstract class Book {
    private String title;
    private String author;
    protected double price;
    private String language;

    public Book(String title, String author, double price, String language) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLanguage() {
        return language;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to be implemented by subclasses to print book-specific attributes
    public abstract void printAttributes();
}

