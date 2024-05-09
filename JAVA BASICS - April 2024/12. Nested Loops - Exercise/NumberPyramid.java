package NestedLoopsExercise;

import java.util.Scanner;

    public class NumberPyramid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int numCounter = 1;

            boolean isNumReached = false;
            for (int row = 1; row <= n; row++) {

                for (int column = 1; column <= row; column++) {
                    if (numCounter > n) {
                        isNumReached = true;
                        break;
                    }
                    System.out.print(numCounter++ + " ");
                }

                if (isNumReached) {
                    break;
                }
                System.out.println();
            }
        }
    }
}
