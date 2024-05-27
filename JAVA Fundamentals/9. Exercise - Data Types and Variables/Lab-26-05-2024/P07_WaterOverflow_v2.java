import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;

        for (int pour = 1; pour <= count; pour++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine()); 
            totalLiters += pouredLiters;

           
            if (totalLiters > 255) {
               
                System.out.println("Insufficient capacity!");
               
                totalLiters -= pouredLiters;
            }

        }

    
        System.out.println(totalLiters);
    }
}
