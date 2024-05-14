import java.util.*;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stackNumbers = new ArrayDeque<>();

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countOfElementsToRemove = tokens[1];
        int checkNumber = tokens[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stackNumbers::push);

        for (int i = 0; i < countOfElementsToRemove; i++) {
            stackNumbers.pop();
        }

        if (stackNumbers.isEmpty()) {
            System.out.println("0");
        } else if (stackNumbers.contains(checkNumber)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(stackNumbers));
        }
    }
}
