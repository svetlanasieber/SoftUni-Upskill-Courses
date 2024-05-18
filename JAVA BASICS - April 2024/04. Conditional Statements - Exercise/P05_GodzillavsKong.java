package conditionalStatements;

import java.util.Scanner;

public class _05_GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        double costumePricePerPerson = Double.parseDouble(scanner.nextLine());

        double decor = (budget * 10) / 100;
        double costumeTotalPrice = costumePricePerPerson * numOfPeople;

        if (numOfPeople > 150) {
            costumeTotalPrice = costumeTotalPrice - ((costumeTotalPrice * 10) / 100);
        }

        double result = decor + costumeTotalPrice;
        double diff = Math.abs(budget - result);

        if (budget >= result) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
