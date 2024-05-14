import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            switch (tokens[0]) {
                case "1":
                    stack.push(text.toString());

                    String str = tokens[1];
                    text.append(str);
                    break;
                case "2":
                    stack.push(text.toString());
                    int countOfElementsToErases = Integer.parseInt(tokens[1]);
                    int start = text.length() - countOfElementsToErases;
                    int end = text.length();

                    text.delete(start, end);
                    break;
                case "3":
                    int idx = Integer.parseInt(tokens[1]);
                    System.out.println(text.charAt(idx - 1));
                    break;
                case "4":
                    text = new StringBuilder(stack.pop());
                    break;
            }
        }
    }
}
