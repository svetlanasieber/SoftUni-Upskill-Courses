package DataTypes_MoreExercise;

import java.util.Scanner;

public class P05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            char symbol = scanner.nextLine().charAt(0);

            System.out.printf("%c", symbol + key);
        }

    }
}
