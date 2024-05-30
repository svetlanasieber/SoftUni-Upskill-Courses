package ArraysExercise;

import java.util.Scanner;

public class P03_ZigZagArrays_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int n = scanner.nextInt();
                int[] array1 = new int[n];
                int[] array2 = new int[n];

                for (int i = 0; i < n; i++) {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();

                    if (i % 2 == 0) {
                        array1[i] = num1;
                        array2[i] = num2;
                    } else {
                        array1[i] = num2;
                        array2[i] = num1;
                    }
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(array1[i] + " ");
                }

                System.out.println();

                for (int i = 0; i < n; i++) {
                    System.out.print(array2[i] + " ");
                }
            }
        }


