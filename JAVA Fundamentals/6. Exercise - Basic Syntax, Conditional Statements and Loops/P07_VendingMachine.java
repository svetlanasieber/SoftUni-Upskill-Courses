import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double sum = 0;
        double productTotal = 0;

        while (!"Start".equals(input)) {
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while (!"End".equals(input)) {
            boolean available = true;
            double price = 0;
            switch (input) {
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    available = false;
            }
            if (available) {
                if (productTotal + price <= sum) {
                    System.out.println("Purchased " + input);
                    productTotal += price;
                    input = sc.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = sc.nextLine();
                }
            } else {
                input = sc.nextLine();
            }
        }
        System.out.printf("Change: %.2f", sum - productTotal);
    }
}
