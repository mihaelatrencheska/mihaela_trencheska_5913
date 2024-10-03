import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System. out. println("Enter agent's name:");
        String fullName= scanner.nextLine();
        System.out.println("Agents full name is:" + fullName);
        int length = fullName.length();
        System.out.println("Length of name is: " + length);

        char middleChar;
        if (length % 2== 0){
            middleChar = fullName.charAt(length/2- 1);
        }else{
middleChar= fullName.charAt(length/2);

    }
System.out.println(