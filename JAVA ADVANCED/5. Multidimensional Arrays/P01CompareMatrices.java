package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        if (firstMatrix.length != secondMatrix.length) {
            System.out.println("not equal");
            return;
        }
        if (firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }
        if (firstMatrix[1].length != secondMatrix[1].length) {
            System.out.println("not equal");
            return;
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < firstMatrix[j].length; i++) {
                if (firstMatrix[j][i] != secondMatrix[j][i]) {
                    System.out.println("not equal");
                    return;
                }
            }

        }
        System.out.println("equal");
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] matrixSize = readArray(scanner);

        int rows = matrixSize[0];
        int columns = matrixSize[1];
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int[] arr = readArray(scanner);
            matrix[i] = arr;
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
