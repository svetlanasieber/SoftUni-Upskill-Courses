package DataTypesVariablesLab;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        // Check if the character is upper-case or lower-case and print the result
        if (Character.isUpperCase(ch)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("lower-case");
        } else {
            System.out.println("The input is not a letter.");
        }

        // Close the scanner
        scanner.close();
    }
}

/*

        /*if (Character.isUpperCase(symbol)) {
            //uppercase
            System.out.println("upper-case");
        } else {
            //lowercase
            System.out.println("lower-case");
        }


 */