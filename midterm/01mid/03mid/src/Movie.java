public class Movie extends Media{
    private double duration;

    public Movie(String title, String creator, double duration) {
        super(title, creator);
        this.duration = duration;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Trailer duration: " + duration);
    }
    public void watchTrailer(){
        System.out.println("The trailer is available to watch");

    }
}
