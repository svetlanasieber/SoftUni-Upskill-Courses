import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximalSum_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);  

        int maxSum = -12312313;
        int rowStartIndex = 0;
        int colStartIndex = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    rowStartIndex = row;
                    colStartIndex = col;
                }
            }
        }
        System.out.printf("Sum = %d\n", maxSum);
        printMaxMatrixEls(matrix, rowStartIndex, colStartIndex);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    private static void printMaxMatrixEls(int[][] matrix, int rowStartIndex, int colStartIndex) {
        for (int row = rowStartIndex; row <= rowStartIndex + 2; row++) {
            for (int col = colStartIndex; col <= colStartIndex + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
