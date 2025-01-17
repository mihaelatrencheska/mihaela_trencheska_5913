public class Book extends Media{
    private int numPages;

    public int getNumPages() {
        return numPages;
    }

    public Book(String title, String creator, int numPages) {
        super(title, creator);
        this.numPages = numPages;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Pages: " + numPages);
    }
    public void readSample(){
        System.out.println("Sample pages are available to read.");
    }
}
