package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05_ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of sea and mountain trips

        int seaTrips = scanner.nextInt();

        int mountainTrips = scanner.nextInt();

        // Constants for prices
        final int SEA_PRICE = 680;
        final int MOUNTAIN_PRICE = 499;

        // Initialize total profit
        int totalProfit = 0;

        // Process packages until "Stop" or all packages are sold
        while (seaTrips > 0 || mountainTrips > 0) {

            String packageType = scanner.next();

            if (packageType.equalsIgnoreCase("Stop")) {
                break;
            }

            if (packageType.equalsIgnoreCase("sea") && seaTrips > 0) {
                totalProfit += SEA_PRICE;
                seaTrips--;
            } else if (packageType.equalsIgnoreCase("mountain") && mountainTrips > 0) {
                totalProfit += MOUNTAIN_PRICE;
                mountainTrips--;
            }

            // Check if all packages are sold
            if (seaTrips == 0 && mountainTrips == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
        }

        // Output the profit
        System.out.println("Profit: " + totalProfit + " leva.");

        scanner.close();
    }
}
