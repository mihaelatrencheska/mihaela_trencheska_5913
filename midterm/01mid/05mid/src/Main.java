import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter price: ");
        double price= scanner.nextDouble();

        double finalPrice;
        if (price>100){
            finalPrice = price* 0.90;
        }else if (price >= 50){
            finalPrice = price * 0.95;
        }else{
            finalPrice = price;
        }
        System.out.println("Final Price after discount: "+ finalPrice);

        scanner.close();
    }
}