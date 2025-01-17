public class Movie extends Media {
    private double duration;

    public Movie(String creator, String title, double duration) {
        super(creator, title);
        this.duration = duration;
    }

    public void watchTrailer(){
        System.out.println("the trailer is available to watch" + title);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Duration: " + duration + "minutes");
    }
}
