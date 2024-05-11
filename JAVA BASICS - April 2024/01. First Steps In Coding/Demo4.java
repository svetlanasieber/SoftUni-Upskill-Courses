package FirstStepsInCodingLab;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("You are " + firstName + " " + lastName + ". You are " + age + " years old.");
    }
}
