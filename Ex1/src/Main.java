import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int r = random.nextInt(500) + 1;
        int i = 0;
        while(i<10){
            r = random.nextInt(500);
            System.out.println(r + " ");
            i++;
        }

        do{
            r= random.nextInt(500);
        }
        while(r>300);
        int counter=0;
        for (int j=0;j<20; j++){
            int a= random.nextInt(500);

            if(a%2==0){
                counter ++;
            }

        }
        System.out.println("there were "+ counter + " even numbers.");

        while( true){
            int b = random.nextInt(500)+1;
            if (b % 7==0){
                System.out.println("The number "+ b+" is divisible by 7");
                break;
            }
        }
    }
}