package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

        double ratePerMonth = (deposit * (rate / 100)) / 12;
        double result = deposit + (period * ratePerMonth);

        System.out.println(result);

    }
}
