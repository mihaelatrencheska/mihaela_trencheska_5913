import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int rows = 0;
        int columns =0 ;
        int [][] matrix;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader= new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter number of rows: ");
            rows = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter number of columns: ");
            rows = Integer.parseInt(bufferedReader.readLine());

            int sum =0;
            matrix = new int[rows][columns];
            for(int i = 0; i<rows ; i ++){
                for(int j=0; j<columns; j++){
                    System.out.println("Enter element: [" + i + "]["+ j + "]: ");
                    matrix[i][j]= Integer.parseInt(bufferedReader.readLine());
                    sum+= matrix[i][j];

                }
            }
            System.out.println("Sum od all the elements in the matrix is : " + sum);
            System.out.println("Average of elements : " + sum/(rows*columns));
        }catch (IOException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}