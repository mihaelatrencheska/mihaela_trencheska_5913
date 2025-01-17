package inventory;

class Magazine extends LibraryItem {
    int issueNumber;

    // Constructor with parameters
    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    // Default constructor
    public Magazine() {}

    // Implementing abstract methods
    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + title + " | Author: " + author + " | Year: " + publicationYear + " | Issue: " + issueNumber);
    }

    @Override
    public String getItemInfo() {
        return "Magazine: " + title + " | Author: " + author;
    }
}