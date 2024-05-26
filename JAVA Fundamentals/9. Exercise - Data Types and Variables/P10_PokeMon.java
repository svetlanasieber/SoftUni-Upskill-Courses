package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int startingPower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokeTargets = 0;
        while (power >= distance) {
            power -= distance;
            pokeTargets++;

            if (power == startingPower / 2) {
                if (exhaustionFactor > 0) {
                    power /= exhaustionFactor;
                }
            }
        }

        System.out.println(power);
        System.out.println(pokeTargets);
    }
}
