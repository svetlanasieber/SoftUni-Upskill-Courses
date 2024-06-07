//https://judge.softuni.org/Contests/Practice/Index/1654#4

import java.util.Scanner;
 
public class P06_VetParking {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
 
        double totalSum = 0;
 
        for (int i = 1; i <= days ; i++) {
 
            double sumForCurrentDay = 0;
 
            for (int j = 1; j <= hours ; j++) {
 
                if(i % 2 == 0 && j % 2 == 1 ){
                    sumForCurrentDay += 2.50;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    sumForCurrentDay += 1.25;
                }else {
                    sumForCurrentDay += 1;
                }
            }
 
            totalSum += sumForCurrentDay;
            System.out.printf("Day: %d - %.2f leva%n", i, sumForCurrentDay);
 
        }
 
        System.out.printf("Total: %.2f leva", totalSum);
 
    }
}
