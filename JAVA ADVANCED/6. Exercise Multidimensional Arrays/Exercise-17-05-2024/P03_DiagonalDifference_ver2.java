import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifference_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];
        fillEls(matrix, scanner);

        int primarySum = (calculatePrimaryDiagonalSum(matrix));
        int secondarySum = (calculateSecondaryDiagonalSum(matrix));

        System.out.println(Math.abs(primarySum - secondarySum));
    }

    private static void fillEls(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    private static int calculatePrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int calculateSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][(matrix.length - 1) - i];
        }
        return sum;
    }
}
