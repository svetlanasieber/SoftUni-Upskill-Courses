import java.util.Arrays;
import java.util.Scanner;

public class P02_FishingCompetition {
    public static boolean isWhirlpool = false;
    public static boolean isQuotaReached = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] fishArea = new String[n][n];

        for (int i = 0; i < n; i++) {
            fishArea[i] = scanner.nextLine().split("");
        }

        int shipRow = 0;
        int shipCol = 0;

        for (int row = 0; row < fishArea.length; row++) {
            for (int col = 0; col < fishArea[row].length; col++) {
                if (fishArea[row][col].equals("S")) {
                    shipRow = row;
                    shipCol = col;
                }
            }
        }

        String line;
        int fishCaught = 0;

        while (!"collect the nets".equals(line = scanner.nextLine())) {
            fishArea[shipRow][shipCol] = "-";
            switch (line) {
                case "up":
                    shipRow--;
                    if (shipRow < 0) {
                        shipRow = fishArea.length - 1;
                    }
                    break;
                case "down":
                    shipRow++;
                    if (shipRow >= fishArea.length) {
                        shipRow = 0;
                    }
                    break;
                case "left":
                    shipCol--;
                    if (shipCol < 0) {
                        shipCol = fishArea.length - 1;
                    }

                    break;
                case "right":
                    shipCol++;
                    if (shipCol >= fishArea.length) {
                        shipCol = 0;
                    }
                    break;
            }

            fishCaught = getCaught(fishArea, shipRow, shipCol, fishCaught);

            if (isWhirlpool) {
                System.out.printf("You fell into a whirlpool! " +
                        "The ship sank and you lost the fish you caught. " +
                        "Last coordinates of the ship: [%d,%d]\n", shipRow, shipCol);
                return;
            }
        }

        if (fishCaught >= 20) {
            System.out.println("Success! You managed to reach the quota!");
            isQuotaReached = true;
        } else {
            System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.\n", 20 - fishCaught);
        }

        if (fishCaught != 0) {
            System.out.printf("Amount of fish caught: %d tons.\n", fishCaught);
        }

        for (int row = 0; row < fishArea.length; row++) {
            for (int col = 0; col < fishArea[row].length; col++) {
                System.out.print(fishArea[row][col]);
            }

            System.out.println();
        }
    }

    private static int getCaught(String[][] fishArea, int shipRow, int shipCol, int fishCaught) {
        if (fishArea[shipRow][shipCol].matches("\\d+")) {
            fishCaught += Integer.parseInt(fishArea[shipRow][shipCol]);

        } else if (fishArea[shipRow][shipCol].equals("W")) {
            fishCaught = 0;
            isWhirlpool = true;
        }

        fishArea[shipRow][shipCol] = "S";
        return fishCaught;
    }
}
