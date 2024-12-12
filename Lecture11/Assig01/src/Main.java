
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String name;
        int year;
        double height;
        double weight;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("what is your name? ");
            name = bufferedReader.readLine();

            System.out.println("what is your year of birth ");
            year = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter your height: ");
            height = Double.parseDouble(bufferedReader.readLine());

            System.out.println("enter your weight in kg");
            weight = Double.parseDouble(bufferedReader.readLine());


            System.out.println("Your name is " + name);
            System.out.println("Your will turn " + (2024 - year) + "years this year");
            System.out.println("Your body mass index is :" + weight / (height * height));
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}