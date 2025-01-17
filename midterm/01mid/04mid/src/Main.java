import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

        System.out.println("Enter score1: ");
        double score1 = scanner.nextDouble();
        System.out.println("Enter score2: ");
        double score2= scanner.nextDouble();
        System.out.println("Enter score3:");
        double score3= scanner.nextDouble();

        double average= (score1+score2+score3)/3;

        String performance;
        if (average>=85){
            performance= "Excellent";
        }else if(average>=70){
            performance = " Good";
        }else if (average>= 50){
            performance= "Average";
        }else{
            performance= "Poor";
        }
        System.out.println("Average score: " + average);
        System.out.println("Performance: " + performance);

        scanner.close();

    }

}