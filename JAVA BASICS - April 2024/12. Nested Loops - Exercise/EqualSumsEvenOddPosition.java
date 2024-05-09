package NestedLoopsExercise;



import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int number = i;
            int evenPositions = 0;
            int oddPositions = 0;

            for (int j = 0; j <= 5; j++) {
                int lastDigit = number % 10;
                number = number / 10;

                if (j % 2 == 0) {
                    evenPositions += lastDigit;
                } else {
                    oddPositions += lastDigit;
                }
            }

            if (evenPositions == oddPositions) {
                System.out.print(i + " ");
            }


        }

    }
}