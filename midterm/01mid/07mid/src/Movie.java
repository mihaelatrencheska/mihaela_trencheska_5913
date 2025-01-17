public class Movie extends Media{
    private double duration;

    public Movie(String title, String creator, double duration) {
        super(title, creator);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }
    @Override
    private void watchTrailer(){
        System.out.println("The trailer is available to watch.");

    }
    private void displayInfo(){
        super.getDuration();
    }
}
