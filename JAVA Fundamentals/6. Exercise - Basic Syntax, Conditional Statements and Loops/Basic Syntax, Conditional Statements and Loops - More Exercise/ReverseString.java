package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        for (int i = length-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }
    }
}
