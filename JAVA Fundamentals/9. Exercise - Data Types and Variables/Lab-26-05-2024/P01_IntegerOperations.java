package DataTypesVariablesExercise;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        //1. first to the second
        //2.  divide (integer) the sum by the third number
        //3. multiply the result by the fourth number
        //4. Print the result.

        // Formule: ((n1 + n2) / n3) * n4
        System.out.println(((number1 + number2) / number3) * number4);

    }
}
