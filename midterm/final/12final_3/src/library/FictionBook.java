package library;

public class FictionBook extends Book{
    public String genre;

    public FictionBook(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public void printDetails(){
        System.out.println("Fiction book: "+);
    }
}
