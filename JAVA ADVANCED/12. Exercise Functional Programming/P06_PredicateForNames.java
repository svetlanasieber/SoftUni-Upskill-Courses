import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06_PredicateForNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<String> lengthFilter = str -> str.length() <= n;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(lengthFilter)
                .forEach(System.out::println);

    }
}
