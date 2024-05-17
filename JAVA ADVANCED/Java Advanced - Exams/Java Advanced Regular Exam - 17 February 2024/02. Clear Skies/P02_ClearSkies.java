import java.util.Scanner;

public class P02_ClearSkies {

    private static int armor = 300;
    private static int enemyPlanes = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] airspace = new char[size][size];

        for (int i = 0; i < size; i++) {
            airspace[i] = scanner.nextLine().toCharArray();
        }

        int[] currentPosition = findStartPosition(size, airspace);

        while (true) {

            if (armor <= 0) {
                assert currentPosition != null;
                System.out.println("Mission failed, your jetfighter was shot down! Last coordinates [" + currentPosition[0]
                        + ", " + currentPosition[1] + "]!");
                break;
            }

            if (enemyPlanes == 0) {
                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                break;
            }

            String command = scanner.nextLine();

            assert currentPosition != null;
            movePlane(command, currentPosition, airspace);
            handleCurrentPosition(currentPosition, airspace);
        }

        for (char[] chars : airspace) {
            System.out.println(chars);
        }
    }


    private static int[] findStartPosition(int size, char[][] airspace) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (airspace[i][j] == 'J') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static void handleCurrentPosition(int[] position, char[][] airspace) {
        char currentChar = airspace[position[0]][position[1]];

        switch (currentChar) {
            case 'E':
                if (enemyPlanes != 1) {
                armor -= 100;
                }
                enemyPlanes--;
                break;
            case 'R':
                if (armor < 300) {
                    armor = 300;
                }
                break;
        }
        airspace[position[0]][position[1]] = 'J';
    }

    private static void movePlane(String command, int[] position, char[][] airspace) {
        int row = position[0];
        int col = position[1];

        airspace[row][col] = '-';

        switch (command) {
            case "up":
                position[0]--;
                break;
            case "down":
                position[0]++;
                break;
            case "left":
                position[1]--;
                break;
            case "right":
                position[1]++;
                break;
        }
    }
}
