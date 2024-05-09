package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            boolean isNumberNegative = false;

            int number = Integer.parseInt(command);
            if (number < 0) {
                System.out.println("Number is negative.");
                isNumberNegative = true;
            }
            int dividersCount = 0;

            if (!isNumberNegative) {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        dividersCount++;
                    }
                }

                if (dividersCount > 2) {
                    nonPrimeNumbersSum += number;
                } else {
                    primeNumbersSum += number;
                }
            }

            command = scanner.nextLine();
        }


        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", primeNumbersSum, nonPrimeNumbersSum);

    }
}
