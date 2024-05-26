package DataTypesVariablesLab;

import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 British Pound = 1.36 Dollars

        double britishPounds = Double.parseDouble(scanner.nextLine());
        double usd = britishPounds * 1.36;
        System.out.printf("%.3f", usd);
    }
}
