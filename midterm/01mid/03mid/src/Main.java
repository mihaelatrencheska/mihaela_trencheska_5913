public class Main {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[2];
        mediaArray[0] = new Book("The Great Gatsby", "F.S.F", 218);
        mediaArray[1] = new Movie("inception", "C.N", 148);

        Library library = new Library();
        library.displayAllMedia(mediaArray);
    }

}