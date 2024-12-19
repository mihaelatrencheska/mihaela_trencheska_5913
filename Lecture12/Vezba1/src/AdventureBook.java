public class AdventureBook extends Book {

    private int publishYear;
    private boolean isIllustrated; // Whether the book is illustrated or not

    public AdventureBook(String title, String author, double price, String language, int publishYear, boolean isIllustrated) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.isIllustrated = isIllustrated;
    }

    @Override
    public void printAttributes() {
        System.out.println("Adventure Book Info:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Language: " + getLanguage());
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Illustrated: " + isIllustrated);
    }

    @Override
    public double getPrice() {
        return super.getPrice(); // Simply use the inherited price from the Book class
    }
}