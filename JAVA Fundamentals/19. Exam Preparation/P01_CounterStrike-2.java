import java.util.Scanner;

public class P01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int energy = Integer.parseInt(scanner.nextLine());


        int wonBattles = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End of battle")) {
                break;
            }

            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                wonBattles++;
                count++;
                energy -= distance;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                return;
            }

            if (count == 3) {
                count = 0;
                energy += wonBattles;
            }
        }

        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
    }
}
