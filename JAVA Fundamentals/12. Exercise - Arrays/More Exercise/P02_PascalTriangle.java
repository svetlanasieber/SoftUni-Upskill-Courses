package ProgrammingFundamentals.Arrays.Exercise.MoreExercise;

import java.util.Scanner;

public class P02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rows; i++) {

            int number = 1;

            for (int j = 0; j <= i; j++) {

                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
