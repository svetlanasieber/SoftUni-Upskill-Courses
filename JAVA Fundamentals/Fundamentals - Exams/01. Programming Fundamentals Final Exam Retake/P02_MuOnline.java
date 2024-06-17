import java.util.Scanner;

public class P02_MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] rooms = scanner.nextLine().split("\\|");

        boolean isAlive = true;
        for (int i = 0; i < rooms.length; i++) {
            String room = rooms[i];
            String[] roomArgs = room.split(" ");
            String command = roomArgs[0];
            int commandValue = Integer.parseInt(roomArgs[1]);

            switch (command) {
                case "potion":
                    int healtBeforeHealing = health;
                    health = Math.min(health + commandValue, 100);
                    System.out.printf("You healed for %d hp.%n", health - healtBeforeHealing);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;

                case "chest":
                    bitcoins += commandValue;
                    System.out.printf("You found %d bitcoins.%n", commandValue);
                    break;

                default:
                    health -= commandValue;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        isAlive = false;
                    }
                    break;
            }

            if (!isAlive) {
                break;
            }
        }

        if (isAlive) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
