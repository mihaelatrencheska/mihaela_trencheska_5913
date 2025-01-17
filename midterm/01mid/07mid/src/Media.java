public class Media {
    private String title;
    private String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    private void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
    }
}
