//https://judge.softuni.bg/Contests/Practice/Index/1699#1
import java.util.Scanner;

public class P01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String movieName = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());
        int countTickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumForDay = countTickets * ticketPrice;
        double totalSumWithoutDiscount = sumForDay * countDays;
        double discount = totalSumWithoutDiscount * percent / 100.0;

        double totalSum = totalSumWithoutDiscount - discount;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, totalSum);



    }
}
