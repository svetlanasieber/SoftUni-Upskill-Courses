package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = getIntArr(scanner);

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];

        readMatrix(matrix, scanner);

        getTheBiggest3by3Matrix(matrix);
    }

    private static void getTheBiggest3by3Matrix(int[][] matrix) {
        int currentMax = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > currentMax) {
                    currentMax = sum;
                    startRow = row;
                    startCol = col;
                }
            }
        }

        System.out.println("Sum = " + currentMax);
        printMatrix(matrix, startRow, startCol);
    }

    private static void printMatrix(int[][] matrix, int startRow, int startCol) {
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }

    private static void readMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = getIntArr(scanner);
        }
    }

    private static int[] getIntArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
