package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05_GodzillaVsKong_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int mutesCount = Integer.parseInt(scanner.nextLine());
        double muteClothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if(mutesCount > 150) {
            muteClothesPrice = muteClothesPrice * 0.90;
        }

        double priceMutesClothing = muteClothesPrice * mutesCount;
        double totalPrice = decor + priceMutesClothing;

        double diff = Math.abs(totalPrice - budget);
        if(totalPrice > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff);
        }
    }
}
