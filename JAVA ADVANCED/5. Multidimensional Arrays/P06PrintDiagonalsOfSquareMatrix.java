package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size  = Integer.parseInt(scanner.nextLine());
        int[][] result = new int[2][size];

        int[][] arr = new int[size][size];

        for (int row = 0; row < size; row++) {
            arr[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int topLeftToBottomRight = 0;
        int bottomRightToTopLeft = size - 1;
        int col = 0;

        for (int i = 0; i < size; i++) {
            result[0][col] = arr[topLeftToBottomRight][col];
            result[1][col] = arr[bottomRightToTopLeft][col];

            col++;
            topLeftToBottomRight++;
            bottomRightToTopLeft--;
        }

        print(result);

    }
    public static void print(int[][] arr){

        for (int row = 0; row < arr.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < arr[row].length; col++) {
                sb.append(arr[row][col])
                        .append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
