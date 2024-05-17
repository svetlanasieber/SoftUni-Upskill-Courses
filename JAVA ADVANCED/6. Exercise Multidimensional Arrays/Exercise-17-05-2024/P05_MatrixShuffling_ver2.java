import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_MatrixShuffling_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);

        String line = scanner.nextLine();
        while (!line.equals("END")) {

            List<String> data = Arrays.stream(line.split("\\s+"))
                    .collect(Collectors.toList());
            if (data.size() != 5) {
                System.out.println("Invalid input!");
                line = scanner.nextLine();
                continue;
            }
            String command = data.get(0);

            if (!command.equals("swap")) {
                System.out.println("Invalid input!");
                line = scanner.nextLine();
                continue;
            }

            int firstElRow = Integer.parseInt(data.get(1));
            int firstElCol = Integer.parseInt(data.get(2));

            int secondElRow = Integer.parseInt(data.get(3));
            int secondElCol = Integer.parseInt(data.get(4));

            if (!(rowAndColValidate(firstElRow, firstElCol, secondElRow, secondElCol, rows, cols))) {
                System.out.println("Invalid input!");
                line = scanner.nextLine();
                continue;
            }

            String saveFirstEl = matrix[firstElRow][firstElCol];
            matrix[firstElRow][firstElCol] = matrix[secondElRow][secondElCol];
            matrix[secondElRow][secondElCol] = saveFirstEl;

            printMatrix(matrix);
            line = scanner.nextLine();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
    }

    private static boolean rowAndColValidate(int firstElRow, int firstElCol, int secondElRow, int secondElCol, int rows, int cols) {
        if (firstElRow < 0 || firstElRow >= rows) {
            return false;
        } else if (firstElCol < 0 || firstElCol >= cols) {
            return false;
        } else if (secondElRow < 0 || secondElRow >= rows) {
            return false;
        } else if (secondElCol < 0 || secondElCol >= cols) {
            return false;
        }
        
        return true;
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
