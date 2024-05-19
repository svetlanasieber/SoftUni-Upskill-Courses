package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.MIN_VALUE;
        int numberTwo = Integer.MAX_VALUE;
        int numberThree = Integer.MAX_VALUE;
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (numberOne <= number) {
                numberOne = number;
            }
            if (numberThree >= number) {
                numberThree = number;
            }
            counter +=number;
        }
        numberTwo = counter-numberOne-numberThree;
        System.out.printf("%d%n%d%n%d%n",numberOne,numberTwo,numberThree);
    }
}
