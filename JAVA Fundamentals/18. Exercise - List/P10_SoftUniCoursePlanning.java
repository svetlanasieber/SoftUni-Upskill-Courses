import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_SoftUniCoursePlanning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandArray = command.split(":");

            switch (commandArray[0]) {
                case "Add":
                    if (!schedule.contains(commandArray[1])) {
                        schedule.add(commandArray[1]);
                    }
                    break;
                case "Remove":
                    schedule.remove(commandArray[1]);
                    break;
                case "Insert":
                    String title = commandArray[1];
                    int index = Integer.parseInt(commandArray[2]);

                    if (!schedule.contains(commandArray[1])) {
                        schedule.add(index, title);
                    }

                    break;
                case "Swap":
                    String firstElement = commandArray[1] + "-Exercise";
                    String secondElement = commandArray[2] + "-Exercise";

                    if (schedule.contains(commandArray[1]) && schedule.contains(commandArray[2])) {

                        if (schedule.contains(firstElement) && schedule.contains(secondElement)) {

                            Collections.swap(schedule, schedule.indexOf(commandArray[1]), schedule.indexOf(commandArray[2]));
                            Collections.swap(schedule, schedule.indexOf(firstElement), schedule.indexOf(secondElement));

                        } else if (schedule.contains(firstElement) && (!schedule.contains(secondElement))) {

                            Collections.swap(schedule, schedule.indexOf(commandArray[1]), schedule.indexOf(commandArray[2]));

                            int exIndex = schedule.indexOf(commandArray[1]);

                            schedule.remove(firstElement);
                            schedule.add(exIndex + 1, firstElement);

                        } else if ((!schedule.contains(firstElement)) && schedule.contains(secondElement)) {

                            Collections.swap(schedule, schedule.indexOf(commandArray[1]), schedule.indexOf(commandArray[2]));

                            int exIndex = schedule.indexOf(commandArray[2]);

                            schedule.remove(secondElement);
                            schedule.add(exIndex + 1, secondElement);

                        } else {
                            Collections.swap(schedule, schedule.indexOf(commandArray[1]), schedule.indexOf(commandArray[2]));
                        }

                    }
                    break;
                case "Exercise":
                    String element = commandArray[1] + "-Exercise";

                    if (schedule.contains(commandArray[1]) && (!schedule.contains(element))) {

                        int indexOfLab = schedule.indexOf(commandArray[1]);
                        schedule.add(indexOfLab + 1, element);

                    } else if (!schedule.contains(commandArray[1])) {

                        schedule.add(commandArray[1]);
                        schedule.add(element);

                    }
                    break;
            }
            command = scanner.nextLine();
        }

        int count = 1;

        for (String s : schedule) {
            System.out.printf("%d.%s%n", count, s);
            count++;
        }
    }
}
