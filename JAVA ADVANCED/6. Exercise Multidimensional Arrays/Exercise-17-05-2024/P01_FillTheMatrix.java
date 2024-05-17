import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int n = Integer.parseInt(input[0]);
        String addType = input[1]; 

        int[][] matrix = new int[n][n];

        if (addType.equals("A")) {
            addingElsOnTypeA(matrix);
        } else if (addType.equals("B")) {
            addingElsOnTypeB(matrix);
        }
        printMatrix(matrix);
    }

    private static void addingElsOnTypeA(int[][] matrix) {

        int counter = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = counter++;
            }
        }
    }

    private static void addingElsOnTypeB(int[][] matrix) {
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = counter++;
                }
            }else {
                for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                    matrix[j][i] = counter++;
                }
            }
        }
    }

    public static void printMatrix(int[][] currentMatrix) {
        for (int i = 0; i < currentMatrix.length; i++) {
            for (int j = 0; j < currentMatrix[i].length; j++) {
                System.out.print(currentMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
