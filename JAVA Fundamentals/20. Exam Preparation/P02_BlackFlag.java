import java.util.Scanner;

public class P02_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine()); 
        int plundersPerDay = Integer.parseInt(scanner.nextLine()); 
        double targetCountPlunders = Double.parseDouble(scanner.nextLine()); 
      
      
        double totalPlunders = 0;

        for (int day = 1; day <= days; day++) {
            totalPlunders += plundersPerDay;

            if (day % 3 == 0) {
                double extraPlunders = 0.5 * plundersPerDay;
              totalPlunders += extraPlunders;
            }

            if (day % 5 == 0) {
                    totalPlunders = totalPlunders - totalPlunders * 0.3;
            
            }

        }
      
        if (totalPlunders >= targetCountPlunders) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunders);
        } else {
            double percent = (totalPlunders / targetCountPlunders) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }
    }
}
