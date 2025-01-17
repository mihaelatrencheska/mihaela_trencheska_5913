public class Main {
    public static void main(String[] args) {
        Book book1= new Book("the java hanboook", "John doe", 251);
        Movie movie1= new Movie("java" , " jm", 125);
        Media[] mediaArray = {book1, movie1};

        Library library = new Library();
        library.displayAllMedia(mediaArray);
    }
}