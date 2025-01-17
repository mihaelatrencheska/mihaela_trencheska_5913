public class Book extends Media{
    private int numPages;

    public Book(String creator, String title, int numPages) {
        super(creator, title);
        this.numPages = numPages;
    }

    public void readSample(){
        System.out.println("Sample pages are available to read " + title);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of pages : " + numPages);
    }
}
