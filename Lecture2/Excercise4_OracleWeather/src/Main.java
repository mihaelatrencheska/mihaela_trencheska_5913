import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
 Scanner scanner= new Scanner( System.in);

 System.out.printf("enter a temperature:");
    int temperature= scanner.nextInt();

    switch (temperature){
        case 30:
            System.out.println("Temperature is 30 degrees. its hot");
            break;
        case 20:
            System.out.println("Temperature is 30 degrees. its warm");
            break;
        case 10:
            System.out.println("Temperature is 30 degrees. its cool");
            break;
        case 0:
            System.out.println("Temperature is 30 degrees. its cold");
            break;

        default :
            if (temperature<0){
                System.out.println("its freezing");
            }else{
                System.out.println("temperature is"+ temperature+"degrees");
            }

    }
    }
}