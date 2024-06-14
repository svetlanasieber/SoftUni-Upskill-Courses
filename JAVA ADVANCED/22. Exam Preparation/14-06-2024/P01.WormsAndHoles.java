import java.util.*;
import java.util.stream.Collectors;

public class P01_WormsAndHoles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> worms = new Stack<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(worms::push);

        Queue<Integer> holes = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList::new));

        int matches = 0;
        int wormsSize = worms.size();

        while (!worms.isEmpty() && !holes.isEmpty()) {

            int currentWorm = worms.peek();
            int currentHole = holes.peek();

            if (currentWorm == currentHole) {
                worms.pop();
                holes.poll();
                matches++;
            } else {
                worms.push(worms.pop() - 3);
                if (worms.peek() <= 0) {
                    worms.pop();
                }
                holes.poll();
            }
        }

        System.out.println(matches == 0 ? "There are no matches." : "Matches: " + matches);

        if (matches != wormsSize) {
            System.out.println("Worms left: " + (!worms.isEmpty()
                    ? String.join(", ", worms.toString().replaceAll("[\\[\\]]", ""))
                    : "none"));
        } else {
            System.out.println("Every worm found a suitable hole!");
        }

        System.out.println("Holes left: " + (!holes.isEmpty() ? String.join(", ", holes.toString()
                .replaceAll("[\\[\\]]", "")) : "none"));
    }
}
