package FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //чрез Math.PI

        double radians = Double.parseDouble(scanner.nextLine());

        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
