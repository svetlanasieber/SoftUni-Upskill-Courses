import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] commandParts = command.split(" - ");
            String commandName = commandParts[0];
            String item = commandParts[1];

            switch (commandName) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;

                case "Drop":
                    items.remove(item);
                    break;

                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];

                    if (items.contains(oldItem)) {
                        int indexOldItem = items.indexOf(oldItem);
                        items.add(indexOldItem + 1, newItem);
                    }
                    break;

                case "Renew":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", items));

    }
}
