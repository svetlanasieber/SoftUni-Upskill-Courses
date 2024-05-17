import java.util.Scanner;

public class P02_MatrixOfPalindromes_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        int counterFirstAndLast = 97;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                char firstAndLast = (char) counterFirstAndLast;
                char midleLetter = (char) (counterFirstAndLast + j);
                matrix[i][j] = "" + firstAndLast + midleLetter + firstAndLast;
            }   
            counterFirstAndLast++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
