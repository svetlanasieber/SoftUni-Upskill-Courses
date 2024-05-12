package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeInSm = width * height * length;
        // 1l = 1dm3
        // 1dm = 10sm
        // 1dm3 = 10sm^3 = 10sm * 10sm * 10sm = 1000sm3 = 1l

        double volume = volumeInSm / 1000.0;
        double finalVolume = volume - (volume * (percent/100));

        System.out.println(finalVolume);
    }
}
