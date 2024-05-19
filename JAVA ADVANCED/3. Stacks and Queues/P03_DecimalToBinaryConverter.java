import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinaryConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(Integer.toBinaryString(number));

    }
}
