# Template 

import java.util.Arrays;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays Array;
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       int number = Integer.parseInt(scanner.nextLine());
    }
}
