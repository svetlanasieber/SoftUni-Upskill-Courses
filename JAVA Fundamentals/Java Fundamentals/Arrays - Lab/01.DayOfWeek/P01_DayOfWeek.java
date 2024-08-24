import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // Variable
        int day = Integer.parseInt(scanner.nextLine());

        // Conditional Statements
        if (day >= 1 && day <= 7)
            System.out.println(days[day - 1]);
        else
            System.out.println("Invalid day!");



    }
}
