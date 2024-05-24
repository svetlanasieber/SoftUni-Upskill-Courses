package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 kvm = 7.61 lv

        double yardMeters = Double.parseDouble(scanner.nextLine());
        double calcTotal = yardMeters * 7.61;
        double calcDiscount = calcTotal * 0.18;
        double total = calcTotal - calcDiscount;

        System.out.println("The final price is: " + total);
        System.out.println("The discount is: " + calcDiscount);

    }
}
