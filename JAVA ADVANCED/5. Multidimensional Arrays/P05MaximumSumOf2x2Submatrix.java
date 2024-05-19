package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];

        int[][] maxSumMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                int current = matrix[r][c];
                int right = matrix[r][c + 1];
                int below = matrix[r + 1][c];
                int rightBellow = matrix[r + 1][c + 1];

                int sum = current+right+below+rightBellow;
                if(sum> maxSum){
                    maxSum = sum;
                    maxSumMatrix[0][0] = current;
                    maxSumMatrix[0][1] = right;
                    maxSumMatrix[1][0] = below;
                    maxSumMatrix[1][1] = rightBellow;
                }
            }
        }

        System.out.println(maxSumMatrix[0][0]+" "+maxSumMatrix[0][1]);
        System.out.println(maxSumMatrix[1][0]+" "+maxSumMatrix[1][1]);
        System.out.println(maxSum);

    }
}
