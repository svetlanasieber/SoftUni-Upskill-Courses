import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> openBrackets = new ArrayDeque<>(); // stack

        String expression = scanner.nextLine();

        for (int i = 0; i < expression.toCharArray().length; i++) {

            if (expression.charAt(i) == '(') {
                openBrackets.push(i);
            } else if (expression.charAt(i) == ')') {
                System.out.println(expression.substring(openBrackets.pop(), i + 1));
            }
        }

    }
}
