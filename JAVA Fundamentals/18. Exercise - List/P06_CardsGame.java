import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P06_CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (!(deck1.isEmpty() || deck2.isEmpty())) {
            if (deck1.get(0).equals(deck2.get(0))) {
                deck1.remove(0);
                deck2.remove(0);
            } else if (deck1.get(0) > deck2.get(0)) {
                deck1.add(deck1.get(0));
                deck1.add(deck2.get(0));
                deck2.remove(0);
                deck1.remove(0);
            } else if (deck1.get(0) < deck2.get(0)) {
                deck2.add(deck2.get(0));
                deck2.add(deck1.get(0));
                deck1.remove(0);
                deck2.remove(0);
            }
        }

        if (deck1.isEmpty()) {
            sum = findSum(deck2, sum);
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            sum = findSum(deck1, sum);
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }

    private static int findSum(List<Integer> deck, int sum) {
        for (int i = 0; i < deck.size(); i++) {
            sum += deck.get(i);
        }
        return sum;
    }
}
