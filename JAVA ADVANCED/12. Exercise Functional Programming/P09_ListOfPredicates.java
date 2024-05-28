import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class O9_ListOfPredicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersToDivide = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        IntPredicate isDivisible = num -> {
            for (int i : numbersToDivide) {
                if (num % i != 0) {
                    return false;
                }
            }

            return true;
        };

        IntStream.rangeClosed(1, n)
                .filter(isDivisible)
                .forEach(num -> System.out.print(num + " "));
    }
}
