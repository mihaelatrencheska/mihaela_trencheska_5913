import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String bank = "";
        double amount = 0;
        try {
            System.out.println("enter bank : ");
            bank = bufferedReader.readLine();
            System.out.println("enter initial amount");
            amount= Double.parseDouble(bufferedReader.readLine());
            Account account= new Account(bank, amount);
            int input = 0;
            System.out.println("choose from options: ");
            System.out.println("1- display bank info ");
            System.out.println("2- current amount status ");
            System.out.println("3- add amount ");
            System.out.println("4- withdraw amount ");
            System.out.println("5- clear all amount");
            input =Integer.parseInt(bufferedReader.readLine());
            switch (input){
                case 1:
                    System.out.println("Bank info : "+ account.getBank());
                    break;
                case 2:
                    System.out.println("Amount info : "+ account.getAmount());
                    break;
                case 3:
                    System.out.println("Enter desired amount: ");
                    double value = Double.parseDouble(bufferedReader.readLine());
                    account.add(value);
                    break;
                case 4:
                    System.out.println("Enter desired amount: ");
                    double value1 = Double.parseDouble(bufferedReader.readLine());
                    account.withdraw(value1);
                    break;
                case 5:
                    account.withdraw(account.getAmount());
                    break;
                default:
                    System.out.println("No such option");
            }

        }catch (IOException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
    }catch (CustomException e){
            System.out.println(e.getMessage());
        }

}
}
