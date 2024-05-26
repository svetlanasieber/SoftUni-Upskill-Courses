package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());

        int sumOfSymbols = 0;
        for (int i = 1; i <= countSymbols; i++) {
            sumOfSymbols += scanner.nextLine().charAt(0);
        }

        System.out.printf("The sum equals: %d", sumOfSymbols);
    }
}
