import java.util.*;

public class BasicQueueOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> queueNumbers = new ArrayDeque<>();

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countOfElementToRemove = tokens[1];
        int checkNumber = tokens[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(queueNumbers::offer);

        for (int i = 0; i < countOfElementToRemove; i++) {
            queueNumbers.poll();
        }

        if (queueNumbers.isEmpty()) {
            System.out.println("0");
        } else if (queueNumbers.contains(checkNumber)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queueNumbers));
        }
    }
}
