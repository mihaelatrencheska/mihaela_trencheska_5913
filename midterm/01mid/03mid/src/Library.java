import java.util.ArrayList;

public class Library {
    public void displayAllMedia(Media [] mediaArray){
        for(Media media : mediaArray){
            media.displayInfo();
            if(media instanceof Book){
                ((Book)media).readSample();
            }else if (media instanceof Movie){
                ((Movie)media).watchTrailer();
            }
            System.out.println();
        }
    }
}
