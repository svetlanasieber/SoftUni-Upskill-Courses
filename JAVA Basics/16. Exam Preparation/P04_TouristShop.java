//https://judge.softuni.org/Contests/Practice/Index/1654#3

import java.util.Scanner;
 
public class P05_TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        double budget = Double.parseDouble(scanner.nextLine());
 
        String command = scanner.nextLine();
 
        double sum = 0;
        int countProducts = 0;
        int countThirdProduct = 0;
        while (!command.equals("Stop")){
 
            double price = Double.parseDouble(scanner.nextLine());
            countProducts++;
            countThirdProduct++;
 
            if(countThirdProduct == 3){
                sum = sum + price / 2;
                countThirdProduct = 0;
            }else {
                sum += price;
            }
 
            if(sum > budget){
                break;
            }
 
 
            command = scanner.nextLine();
        }
 
 
        if(sum < budget){
            System.out.printf("You bought %d products for %.2f leva.", countProducts, sum);
        }else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", sum - budget);
        }
 
 
    }
}
