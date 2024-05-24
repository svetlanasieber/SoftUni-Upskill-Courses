package ConditionalStatementsLab;

import java.util.Scanner;

public class booleanType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        boolean isPositive = a > 0;
        System.out.println(isPositive); // true

        int a2 = -5;
        boolean isPositive2 = a2 > 0;
        System.out.println(isPositive2); // false


    }
}
