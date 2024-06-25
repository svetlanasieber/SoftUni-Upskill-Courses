package StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        
        String[] input = scanner.nextLine().split("\\s+");
        String command = input[0];
        while (!command.equals("Exit")) {
            studentSystem.parseCommand(input);
            input = scanner.nextLine().split("\\s+");
            command = input[0];
        }
    }
}
