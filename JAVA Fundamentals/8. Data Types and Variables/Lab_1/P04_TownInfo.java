package DataTypesVariablesLab;

import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. the name of the town
        String town = scanner.nextLine();
        //2. the population
        int population = Integer.parseInt(scanner.nextLine());
        //3. the area
        int area = Integer.parseInt(scanner.nextLine());

        //"Town {town name} has population of {population} and area {area} square km.".
        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);
    }
}
