import java.util.Scanner;

public class P02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] rooms = scanner.nextLine().split("\\|");

        int roomsCount = 0;
        for (int i = 0; i < rooms.length; i++) {
            String currentRoom = rooms[i];
            roomsCount++;

            String command = currentRoom.split(" ")[0];
            int value = Integer.parseInt(currentRoom.split(" ")[1]);

            if (command.equals("potion")) {
                int healthBefore = health;
                health = Math.min(health + value, 100);

                System.out.printf("You healed for %d hp.\n", health - healthBefore);
                System.out.printf("Current health: %d hp.\n", health);

            } else if (command.equals("chest")) {
                bitcoins += value;
                System.out.printf("You found %d bitcoins.\n", value);
            } else {
                health -= value;

                if (health > 0) {
                    System.out.printf("You slayed %s.\n", command);
                } else {
                    System.out.printf("You died! Killed by %s.\n", command);
                    System.out.printf("Best room: %d\n", roomsCount);
                    return;
                }
            }
        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", bitcoins);
        System.out.printf("Health: %d\n", health);
    }
}
