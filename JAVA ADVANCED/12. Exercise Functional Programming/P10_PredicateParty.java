import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10_PredicateParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> predicate;
        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String line;
        while (!"Party!".equals(line = scanner.nextLine())) {
            String[] tokens = line.split("\\s+");

            String command = tokens[0];
            String criteria = tokens[1];
            String parameters = tokens[2];

            switch (criteria) {
                case "StartsWith":
                    predicate = str -> str.startsWith(parameters);
                    break;
                case "EndsWith":
                    predicate = str -> str.endsWith(parameters);
                    break;
                default:
                    predicate = str -> str.length() <= Integer.parseInt(parameters);
                    break;
            }

            switch (command) {
                case "Remove":
                    guests.removeIf(predicate);
                    break;
                case "Double":
                    List<String> guestToDouble = guests.stream()
                            .filter(predicate)
                            .collect(Collectors.toList());

                    guests.addAll(guestToDouble);
                    break;
            }
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);
            String join = String.join(", ", guests);
            System.out.println(join + " are going to the party!");
        }
    }
}
