package FirstStepsInCodingLab;

import java.util.Scanner;

public class Demo4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());


        System.out.printf("You are %d years old.%n", age);
        //System.out.println("You are " + firstName + " " + lastName + ". You are " + age + " years old." );
    }
}
