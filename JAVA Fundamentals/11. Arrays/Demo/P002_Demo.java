import java.util.Scanner;

public class P002_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[10];

        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 24;
        numbers[3] = 4;
        numbers[4] = 7;
        System.out.println(numbers[3]);

    }
}
