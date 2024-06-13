import java.util.*;
import java.util.stream.Collectors;

public class P01_OffRoadChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> altitudeNames = new ArrayDeque<>(List.of("Altitude 1", "Altitude 2", "Altitude 3", "Altitude 4"));

        Stack<Integer> fuel = new Stack<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(fuel::push);


        Queue<Integer> consumptionIndex = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toCollection(LinkedList::new));

        Queue<Integer> neededFuelAmount = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toCollection(LinkedList::new));

        Map<String, Integer> altitudesWithValues = new LinkedHashMap<>();

        altitudeNames.forEach(key -> {
            if (!neededFuelAmount.isEmpty()) {
                int value = neededFuelAmount.poll();
                altitudesWithValues.put(key, value);
            }
        });

        List<String> reachedAltitudes = new ArrayList<>();

        while (!fuel.isEmpty() && !consumptionIndex.isEmpty() && !altitudesWithValues.isEmpty()) {

            String currentLevel = altitudeNames.getFirst();

            int currentFuel = fuel.peek();
            int additionalConsumption = consumptionIndex.peek();
            int difference = currentFuel - additionalConsumption;

            if (difference >= altitudesWithValues.get(currentLevel)) {
                fuel.pop();
                consumptionIndex.poll();
                reachedAltitudes.add(currentLevel);
                altitudesWithValues.remove(currentLevel);
                altitudeNames.remove(currentLevel);
                System.out.println("John has reached: " + currentLevel);
            } else {
                fuel.pop();
                consumptionIndex.poll();
                altitudeNames.remove();
                System.out.println("John did not reach: " + currentLevel);
                break;
            }
        }

        if (altitudesWithValues.isEmpty()) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            System.out.println("John failed to reach the top.");
            if (!reachedAltitudes.isEmpty()) {
                System.out.print("Reached altitudes: ");
            } else {
                System.out.println("John didn't reach any altitude.");
            }

            System.out.print(String.join(", ", reachedAltitudes));
        }
    }
}
