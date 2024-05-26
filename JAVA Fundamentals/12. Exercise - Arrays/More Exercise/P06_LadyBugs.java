package ProgrammingFundamentals.Arrays.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];
        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int ladyBugIndex : ladyBugsIndexes) {
            if (ladyBugIndex >= 0 && ladyBugIndex <= field.length - 1) {
                field[ladyBugIndex] = 1;
            }
        }

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] inputArgs = input.split(" ");
            int idx = Integer.parseInt(inputArgs[0]);
            String direction = inputArgs[1];
            int flyLength = Integer.parseInt(inputArgs[2]);

            if (idx >= 0 && idx <= field.length - 1 && field[idx] == 1) {

                field[idx] = 0;
                if (direction.equals("right")) {
                    idx += flyLength;

                    while (idx <= field.length - 1 && field[idx] == 1) {
                        idx += flyLength;
                    }

                    if (idx <= field.length - 1) {
                        field[idx] = 1;
                    }
                } else if (direction.equals("left")) {
                    idx -= flyLength;

                    while (idx >= 0 && field[idx] == 1) {
                        idx -= flyLength;
                    }

                    if (idx >= 0) {
                        field[idx] = 1;
                    }
                }
            }
        }

        for (int currentSection : field) {
            System.out.print(currentSection + " ");
        }
    }
}

