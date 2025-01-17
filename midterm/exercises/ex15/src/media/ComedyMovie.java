package media;

class ComedyMovie extends Movie {
    int jokesCount;

    public ComedyMovie(String title, String director, int duration, double price, int jokesCount) {
        super(title, director, duration, price);
        this.jokesCount = jokesCount;
    }

    @Override
    void printDetails() {
        System.out.println("Comedy Movie: " + title + ", Director: " + director + ", Duration: " + duration + " mins, Jokes: " + jokesCount);
    }

    @Override
    double getPrice() {
        return price;
    }
}

