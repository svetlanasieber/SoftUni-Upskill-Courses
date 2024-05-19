import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOrders = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 0; i < numOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            double capsulesCount = Double.parseDouble(scanner.nextLine());
            double ordersSum = pricePerCapsule * daysInMonth * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n",ordersSum);
            totalSum +=ordersSum;
        }
        System.out.printf("Total: $%.2f",totalSum);


    }
}
