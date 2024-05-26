package ProgrammingFundamentals.Arrays.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new  int[n];


        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int totalSum = 0;

            for (int j = 0; j < name.length(); j++) {
                char currentEl = name.charAt(j);

                if (currentEl == 'a' ||
                    currentEl == 'e' ||
                    currentEl == 'i' ||
                    currentEl == 'o' ||
                    currentEl == 'u' ||
                    currentEl == 'A' ||
                    currentEl == 'E' ||
                    currentEl == 'I' ||
                    currentEl == 'O' ||
                    currentEl == 'U') {

                    totalSum += currentEl * name.length();
                } else {
                    totalSum += currentEl / name.length();
                }
            }

            numbers[i] = totalSum;
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
