package DataTypesVariablesExercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int dayCounter = 0;
        int yieldTotal = 0;

        if(startingYield >= 100){
            yieldTotal -= 26;
        }

        while (startingYield >= 100){
            yieldTotal += startingYield;
            yieldTotal -= 26;
            startingYield -=10;
            dayCounter++;
        }
        System.out.println(dayCounter);
        System.out.println(yieldTotal);
    }
}
