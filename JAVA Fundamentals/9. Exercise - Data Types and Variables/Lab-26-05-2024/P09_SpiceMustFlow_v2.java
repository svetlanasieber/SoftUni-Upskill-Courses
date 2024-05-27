import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine()); 
        int days = 0;
        int total = 0;
        while (startingYield >= 100) {
            days++;
            int spicePerDay = startingYield - 26;
           
            total += spicePerDay;

            startingYield -= 10; 
        }

             total -= 26;

       
        if (total < 0) {
            total = 0;
        }

        System.out.println(days);
        System.out.println(total);


    }
}
