package FirstStepsInCodingLab;

import java.util.Scanner;

public class GreetingByName_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        //"Hello, <name>!",
        System.out.println("Hello, " + name + "!");

    }
}
