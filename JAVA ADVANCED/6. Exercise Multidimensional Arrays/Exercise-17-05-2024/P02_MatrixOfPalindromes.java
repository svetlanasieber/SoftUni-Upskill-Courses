package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_MatrixOfPalindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        String[][] matrix = new String[rows][cols];
        StringBuilder sb = new StringBuilder();

        char chr = 'a';
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sb.append(chr);
                sb.append((char) (chr + col));
                sb.append(chr);

                System.out.print(sb + " ");
                sb.setLength(0);
            }

            chr++;
            System.out.println();
        }
    }
}
