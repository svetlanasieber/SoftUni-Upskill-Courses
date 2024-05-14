import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequenceParentheses = scanner.nextLine().split("");

        boolean result = isBalanced(sequenceParentheses);

        System.out.println(result ? "YES" : "NO");
    }

    private static boolean isBalanced(String[] sequenceParentheses) {

        Deque<String> stackOpenBraces = new ArrayDeque<>();

        if (sequenceParentheses.length % 2 != 0) {
            return false;
        }

        for (String brace : sequenceParentheses) {

            switch (brace) {
                case ")":
                    if (stackOpenBraces.isEmpty()) {
                        return false;
                    } else {
                        if (!stackOpenBraces.pop().equals("(")) {
                            return false;
                        }
                    }
                    break;

                case "]":
                    if (stackOpenBraces.isEmpty()) {
                        return false;
                    } else {
                        if (!stackOpenBraces.pop().equals("[")) {
                            return false;
                        }
                    }
                    break;

                case "}":
                    if (stackOpenBraces.isEmpty()) {
                        return false;
                    } else {
                        if (!stackOpenBraces.pop().equals("{")) {
                            return false;
                        }
                    }
                    break;

                default:
                    stackOpenBraces.push(brace);
                    break;
            }
        }

        return stackOpenBraces.isEmpty();
    }
}
