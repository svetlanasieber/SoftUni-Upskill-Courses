import java.util.Scanner;

public class P01_ComputerStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        double resultMultiplier = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("regular")) {
                resultMultiplier = 1;
                break;
            }

            if (line.equals("special")) {
                resultMultiplier = 0.9;
                break;
            }

            double price = Double.parseDouble(line);
            if (price > 0) {
                totalPrice += price;
            } else {
                System.out.println("Invalid price!");
            }
        }


        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            double taxes = totalPrice * 0.2;
            double result = (totalPrice + taxes) * resultMultiplier;

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", result);
        }

    }
}
