import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P11_ThePartyReservationFilterModule {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .collect(Collectors.toList());

        Predicate<String> predicate;

        List<String> commands = new ArrayList<>();

        String line;
        while (!"Print".equals(line = scanner.nextLine())) {
            String[] tokens = line.split(";");

            String command = tokens[0];
            String filterType = tokens[1];
            String filterParameters = tokens[2];

            if (command.equals("Add filter")) {
                commands.add(line);
            } else if (command.equals("Remove filter")) {
                String commandToRemove = "Add filter;" + filterType + ";" + filterParameters;
                commands.removeIf(s -> s.equals(commandToRemove));
            }
        }

        for (String command : commands) {
            String filterType = command.split(";")[1];
            String filterParameters = command.split(";")[2];

            switch (filterType) {
                case "Starts with":
                    predicate = str -> str.startsWith(filterParameters);
                    break;
                case "Ends with":
                    predicate = str -> str.endsWith(filterParameters);
                    break;
                case "Length":
                    predicate = str -> str.length() == Integer.parseInt(filterParameters);
                    break;
                default: //Contains
                    predicate = str -> str.contains(filterParameters);
                    break;
            }

            guests.removeIf(predicate);
        }

        System.out.println(guests.stream().collect(Collectors.joining(" ")).toString().replaceAll("([\\[\\]])", ""));
    }
}
