import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 10;
        int[][] matrix = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }


        System.out.println("Treasure Map (5x10 Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nRow Sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.printf("Sum of row %d: %d%n", i + 1, rowSum);
        }
    }
}