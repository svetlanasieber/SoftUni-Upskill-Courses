package DataTypesVariablesExercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        String biggestKegName = "";
        double biggestKegVolume = Double.MIN_VALUE;

        for(int i = 1; i <= countKegs; i++){
            String kegNumber = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;

            if (kegVolume > biggestKegVolume){
                biggestKegName = kegNumber;
                biggestKegVolume = kegVolume;
            }
        }
        System.out.print(biggestKegName);
    }
}
