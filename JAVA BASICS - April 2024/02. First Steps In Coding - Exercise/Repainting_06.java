import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prices for the products stored in an array
        double[] prices = {1.50, 14.50, 5.00, 0.40}; // index 0: nylon, index 1: paint, index 2: thinner, index 3: bags

        System.out.println();
        int nylon = Integer.parseInt(scanner.nextLine());
        System.out.println();
        int paint = Integer.parseInt(scanner.nextLine());
        System.out.println();
        int thinner = Integer.parseInt(scanner.nextLine());
        System.out.println();
        int hoursNeed = Integer.parseInt(scanner.nextLine());

        // Calculating the costs of materials
        double sumNylon = (nylon + 2) * prices[0]; // Added 2 more nylon
        double sumPaint = (paint + 0.1 * paint) * prices[1]; // Added 10% more paint
        double sumThinner = thinner * prices[2]; // Cost for thinner
        double bags = prices[3]; // Cost for bags

        // Total material cost
        double allMats = sumNylon + sumPaint + sumThinner + bags;

        // Labor cost based on total material cost and hours needed
        double sumMasters = (allMats * 0.3) * hoursNeed; // Labor cost is 30% of materials cost per hour

        // Total cost calculation
        double total = allMats + sumMasters;

        System.out.println("Total cost for the repainting job is: " + total);
    }
}

