import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter age: ");
        double age= scanner.nextDouble();
        
        String group;
        if(age< 13){
            group = "Child";
        } else if (age<19) {
            group= "Teen";
        } else if (age<64) {
            group = "Adult";
        }else {
            group = "Senior";
        }
        System.out.println("Your age group: " + group);
        scanner.close();
    }

}