import java.util.Scanner;

public class P08_TriangleOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        // Check if n is within the valid interval [1, 20]
        if (n < 1 || n > 20) {

            return;
        }

        // Loop to print the triangle
        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");


            }
            System.out.println();
        }
    }
}
