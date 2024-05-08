package ConditionalStatementsLab;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 10;
        System.out.println(a < b);
        System.out.println(a > 0);
        System.out.println(a > 100);
        System.out.println(a < a);
        System.out.println(a <= 5);
        System.out.println(b == 2 * a);
    }
}
