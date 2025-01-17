package library;

public abstract class Publication {
    public  String title;
    public String publisher;
    public int publicationYear;

    public Publication(String title, String publisher, int publicationYear) {
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public Publication() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void printDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("PublicationYear: " + getPublicationYear());
    }
    public void getPublicationFee(){


    }
}
