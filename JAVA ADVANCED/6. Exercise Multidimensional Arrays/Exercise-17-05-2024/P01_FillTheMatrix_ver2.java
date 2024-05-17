package MultidimensionalArrays;

import java.util.Scanner;

public class P01_FillTheMatrix_ver2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");

        int dimension = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix = new int[dimension][dimension];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix, scanner);
        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix, scanner);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int colElement : row) {
                System.out.print(colElement + " ");
            }

            System.out.println();
        }
    }
    private static void fillMatrixPatternB(int[][] matrix, Scanner scanner) {
        int i = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = i++;
                }
            } else {
                for (int row = matrix[col].length - 1; row >= 0; row--) {
                    matrix[row][col] = i++;
                }
            }
        }
    }
    private static void fillMatrixPatternA(int[][] matrix, Scanner scanner) {
        int i = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = i++;
            }
        }
    }
}