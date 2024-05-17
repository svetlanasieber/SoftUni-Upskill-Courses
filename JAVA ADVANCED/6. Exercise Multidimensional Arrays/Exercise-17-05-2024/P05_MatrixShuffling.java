import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        String[][] matrix = new String[rows][cols];

        readMatrix(matrix, scanner);

        shuffleMatrix(matrix, scanner);

    }

    private static void shuffleMatrix(String[][] matrix, Scanner scanner) {
        String line;

        while (!"END".equals(line = scanner.nextLine())) {
            String[] tokens = line.split("\\s+");

            if (!tokens[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            }

            if (tokens.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }

            int firstRow = Integer.parseInt(tokens[1]);
            int firstCol = Integer.parseInt(tokens[2]);

            int secondRow = Integer.parseInt(tokens[3]);
            int secondCol = Integer.parseInt(tokens[4]);

            if (firstRow >= 0 && firstRow <= matrix.length - 1 &&
                    secondRow >= 0 && secondRow <= matrix.length - 1 &&
                    firstCol >= 0 && firstCol <= matrix[firstRow].length - 1 &&
                    secondCol >= 0 && secondCol <= matrix[secondRow].length - 1) {

                String firstEl = matrix[firstRow][firstCol];
                String secondEl = matrix[secondRow][secondCol];

                matrix[firstRow][firstCol] = secondEl;
                matrix[secondRow][secondCol] = firstEl;

                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String col : row) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    private static void readMatrix(String[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }
}
