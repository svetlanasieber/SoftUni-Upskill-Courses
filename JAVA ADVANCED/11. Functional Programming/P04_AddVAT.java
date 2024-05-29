import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04_AddVat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = num -> num * 1.20;

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(n -> System.out.printf("%.2f\n", n));
    }
}
