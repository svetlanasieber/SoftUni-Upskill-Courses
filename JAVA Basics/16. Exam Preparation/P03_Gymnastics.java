//https://judge.softuni.org/Contests/Practice/Index/1538#4

import java.util.Scanner;
 
public class P03_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String country = scanner.nextLine();
        String tools = scanner.nextLine();
 
        double sumPoints = 0;
 
        switch (tools){
            case "ribbon":
                if (country.equals("Russia")){
                    sumPoints = 9.100 + 9.400;
                } else if (country.equals("Bulgaria")) {
                    sumPoints = 9.600 + 9.400;
                } else if (country.equals("Italy")) {
                    sumPoints = 9.200 + 9.500;
                }
                break;
            case "hoop":
                if (country.equals("Russia")){
                    sumPoints = 9.300 + 9.800;
                } else if (country.equals("Bulgaria")) {
                    sumPoints = 9.550 + 9.750;
                } else if (country.equals("Italy")) {
                    sumPoints = 9.450 + 9.350;
                }
                break;
            case "rope":
                if (country.equals("Russia")){
                    sumPoints = 9.600 + 9.000;
                } else if (country.equals("Bulgaria")) {
                    sumPoints = 9.500 + 9.400;
                } else if (country.equals("Italy")) {
                    sumPoints = 9.700 + 9.150;
                }
                break;
        }
 
        double percentToMax = ((20 - sumPoints) / 20) * 100;
 
        System.out.printf("The team of %s get %.3f on %s.%n", country, sumPoints, tools);
        System.out.printf("%.2f%%", percentToMax);
 
 
    }
}
