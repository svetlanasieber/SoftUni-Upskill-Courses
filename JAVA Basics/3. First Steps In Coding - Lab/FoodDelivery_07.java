package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double calcChicken = chickenMenu * 10.35;
        double calcFish = fishMenu * 12.40;
        double calcVegetarian = vegetarianMenu * 8.15;
        double allMenus = calcChicken + calcFish + calcVegetarian;
        double desert = allMenus * 0.2;
        double delivery = 2.50;
        double total = allMenus + desert + delivery;

        System.out.println(total);
    }
}
