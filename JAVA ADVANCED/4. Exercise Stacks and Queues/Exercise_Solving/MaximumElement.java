import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stackNumbers = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            switch (tokens[0]) {
                case 1:
                    stackNumbers.push(tokens[1]);
                    break;
                case 2:
                    stackNumbers.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stackNumbers));
                    break;
            }
        }
    }
}
