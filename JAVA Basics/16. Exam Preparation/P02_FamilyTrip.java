//https://judge.softuni.org/Contests/Practice/Index/1745#1

import java.util.Scanner;
import java.text.DecimalFormat;

public class P02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int overheadPercentage = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight *= 0.95;
        }

       
        double totalCostForNights = nights * pricePerNight;
     
        double overheadCosts = (budget * overheadPercentage) / 100;

       
        double totalExpenses = totalCostForNights + overheadCosts;

        if (budget >= totalExpenses) {
            double remainingFunds = budget - totalExpenses;
            System.out.println("Ivanovi will be left with " + df.format(remainingFunds) + " leva after vacation.");
        } else {
            double additionalNeeded = totalExpenses - budget;
            System.out.println(df.format(additionalNeeded) + " leva needed.");
        }

        scanner.close();
    }
}
