package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting_06_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plasticCount = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hoursTotalWorkers = Integer.parseInt(scanner.nextLine());

        double plasticSum = (plasticCount + 2) * 1.50;
        double paintSum = (paintLiters + (paintLiters * 0.10)) * 14.50;
        double thinnerSum = thinnerLiters * 5.0;
        double totalSum = plasticSum + paintSum + thinnerSum + 0.40;

        double priceWorkersForOneHour = totalSum * 0.30;
        double priceWorkersAll = priceWorkersForOneHour * hoursTotalWorkers;
        System.out.println(totalSum + priceWorkersAll);
    }
}
