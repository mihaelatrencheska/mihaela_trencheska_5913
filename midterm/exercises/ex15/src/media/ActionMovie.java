package media;

class ActionMovie extends Movie {
    int stuntsCount;

    public ActionMovie(String title, String director, int duration, double price, int stuntsCount) {
        super(title, director, duration, price);
        this.stuntsCount = stuntsCount;
    }

    @Override
    void printDetails() {
        System.out.println("Action Movie: " + title + ", Director: " + director + ", Duration: " + duration + " mins, Stunts: " + stuntsCount);
    }

    @Override
    double getPrice() {
        return price;
    }
}

