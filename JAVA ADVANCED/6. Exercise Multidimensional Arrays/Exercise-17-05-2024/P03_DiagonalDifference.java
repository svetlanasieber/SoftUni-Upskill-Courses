import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        readMatrix(matrix, scanner);

        int primaryDiagonal = getSumOfPrimaryDiagonal(matrix);
        int secondaryDiagonal = getSumOfSecondaryDiagonal(matrix);

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }

    private static int getSumOfSecondaryDiagonal(int[][] matrix) {
        int sum = 0;

        int rows = matrix.length - 1;
        for (int col = 0; col < matrix.length; col++) {
            sum += matrix[rows--][col];
        }

        return sum;
    }

    private static int getSumOfPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int rowAndCol = 0; rowAndCol < matrix.length; rowAndCol++) {
            sum += matrix[rowAndCol][rowAndCol];
        }

        return sum;
    }

    private static void readMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}