
public class Main {
    public static void main(String[] args) {

        MagicBox magicBox = new MagicBox();
        magicBox.display();
        int numEven=  magicBox.findEvenNum();
        System.out.println("number of even numbers is : " + numEven);
        double averageValue= magicBox.calculateAverage();
        System.out.println("Average of numbers: " + averageValue);
    }
}