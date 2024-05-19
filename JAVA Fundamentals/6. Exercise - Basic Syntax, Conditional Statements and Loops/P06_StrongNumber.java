package BasicSyntaxConditionalStatementsAndLoops.Exercise1;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int startNumber=number;
        int sumFact = 0;


        while(number > 0 ){
            int lastDigit = number % 10;

            int factorial = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                factorial = factorial * i;
            }
            sumFact+=factorial;

            number/=10;

        }
        if (sumFact==startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");


        }
    }
}
