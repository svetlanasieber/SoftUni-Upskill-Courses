import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }

            String command = input.split(" ")[0];

            if (command.equals("Shoot")) {
                int idxToShoot = Integer.parseInt(input.split(" ")[1]);
                int power = Integer.parseInt(input.split(" ")[2]);

                if (isExists(targets, idxToShoot)) {
                    int currentTargetValue = targets.get(idxToShoot);
                    int valueAfterShoot = currentTargetValue - power;

                    if (valueAfterShoot > 0) {
                        targets.set(idxToShoot, valueAfterShoot);
                    } else {
                        targets.remove(idxToShoot);
                    }
                }
            } else if (command.equals("Add")) {
                int idxToAdd = Integer.parseInt(input.split(" ")[1]);
                int value = Integer.parseInt(input.split(" ")[2]);

                if (isExists(targets, idxToAdd)) {
                    targets.add(idxToAdd, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (command.equals("Strike")) {
                int idxToStrike = Integer.parseInt(input.split(" ")[1]);
                int radius = Integer.parseInt(input.split(" ")[2]);

                int leftIdx = idxToStrike - radius;
                int rightIdx = idxToStrike + radius;

                if (isExists(targets, leftIdx) && isExists(targets, rightIdx)) {
                    int count = (radius * 2 )+ 1;

                    for (int i = 0; i < count; i++) {
                        targets.remove(leftIdx);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
        }

        System.out.print(String.format(String.valueOf(targets))
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .replace(",", "|"));
    }

    public static boolean isExists(List<Integer> targets, int idx) {
        return idx >= 0 && idx <= targets.size() - 1;
    }
}
