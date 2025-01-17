public class Media {
    protected String title;
    protected String creator;

    public Media(String creator, String title) {
        this.creator = creator;
        this.title = title;
    }

    public void displayInfo(){
        System.out.println("Enter title: "+ title);
        System.out.println("Enter creator: " + creator);

    }
}

