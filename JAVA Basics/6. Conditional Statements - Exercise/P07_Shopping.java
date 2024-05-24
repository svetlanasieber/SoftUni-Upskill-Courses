package ConditionalStatementsExercise;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoCount * 250.0;
        double processorsPrice = processorsCount * (videoPrice * 0.35);
        double ramPrice = ramCount * (videoPrice * 0.10);

        double sumPrice = videoPrice + processorsPrice + ramPrice;

        if (videoCount > processorsCount) {
            sumPrice = sumPrice - (sumPrice * 0.15);
            // sumPrice = sumPrice * 0.85;
        }

        double diff = Math.abs(budget - sumPrice);
        if (budget >= sumPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
