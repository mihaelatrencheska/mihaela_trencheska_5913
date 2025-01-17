

public class Book extends Media{
    private int numPages;

    public Book(String title, String creator, int numPages) {
        super(title, creator);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }
    @Override
    private void readSample(){
        System.out.println("The sample pages are available to read.");
    }
    private void displayInfo(){
        getNumPages();
    }
}
