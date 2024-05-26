package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int extractedSpices = 0;

        while (startingYield >= 100) {
            days++;
            extractedSpices += startingYield - 26;
            startingYield -= 10;
        }

        extractedSpices -= 26;

        if (extractedSpices < 0) {
            extractedSpices = 0;
        }

        System.out.println(days);
        System.out.println(extractedSpices);
    }
}
