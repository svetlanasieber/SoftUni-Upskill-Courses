package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = (int) Math.ceil((double) numberOfPeople / capacity);
        System.out.println(fullCourses);
    }
}
