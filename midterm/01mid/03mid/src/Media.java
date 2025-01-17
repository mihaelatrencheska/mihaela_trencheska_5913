public class Media {
    private String title;
    private String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public void displayInfo(){
        System.out.println("Enter title: " + title);
        System.out.println("Enter creator: " + creator);
    }


}
