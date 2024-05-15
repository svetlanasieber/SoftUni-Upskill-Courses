package BasicsSyntaxLab;

import java.util.Scanner;

public class PassedOrFailed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Read a floating-point number, which represents a grade
        //•	If the grade is equal or more than 3.00, print "Passed!"
        //•	If the grade is smaller than 3.00, print "Failed!"

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.0) {
            System.out.println("Passed!");
        } else if (grade <= 3.0) {
            System.out.println("Failed!");
        }

    }
}
