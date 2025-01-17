package media;

abstract class Movie {
    String title;
    String director;
    int duration;
    double price;

    public Movie(String title, String director, int duration, double price) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.price = price;
    }

    abstract void printDetails();
    abstract double getPrice();
}
