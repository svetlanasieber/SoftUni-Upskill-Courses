import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReverseMatrixDiagonals_11 {

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

        final int[] dimensions = Arrays
                .stream(reader.readLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        final int rows = dimensions[0];
        final int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays
                    .stream(reader.readLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        final StringBuilder sb = new StringBuilder();

        for(int diagonal = cols - 1; diagonal >= 0; diagonal--) {
            int row = rows -1;
            int col = diagonal;

            do {
                sb.append(matrix[row--][col++]).append(' ');
            } while (row >= 0 && col < cols);

            sb.append(System.lineSeparator());
        }

        for(int startRow = rows - 2; startRow >= 0; startRow--) {
            int row = startRow;
            int col = 0;

            do {
                sb.append(matrix[row--][col++]).append(' ');
            } while (row >= 0 && col < cols);

            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString().trim());
    }
}