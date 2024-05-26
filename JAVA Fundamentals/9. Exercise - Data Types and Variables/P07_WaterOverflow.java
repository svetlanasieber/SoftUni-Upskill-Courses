package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 0;
        for (int i = 1; i <= n; i++) {
            int waterMustPour = Integer.parseInt(scanner.nextLine());

            capacity += waterMustPour;
            if (capacity > 255) {
                capacity -= waterMustPour;
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(capacity);
    }
}
