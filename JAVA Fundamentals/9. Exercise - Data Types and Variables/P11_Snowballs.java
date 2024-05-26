package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        double bestValue = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow(((double) snow / time), quality);

            if (value > bestValue) {
                bestSnow = snow;
                bestTime = time;
                bestValue = value;
                bestQuality = quality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
