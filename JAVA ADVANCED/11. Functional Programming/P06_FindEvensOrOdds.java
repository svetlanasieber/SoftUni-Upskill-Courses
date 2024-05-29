import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class P06_FindEvensOrOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.next().split("\\s+")[0]);
        int end = Integer.parseInt(scanner.nextLine().split("\\s+")[1]);

        String command = scanner.nextLine();

        Function<String, IntPredicate> filter = con -> {
            if ("even".equals(con)) {
                return n -> n % 2 == 0;
            }
            return n -> n % 2 != 0;
        };

        IntPredicate predicate = filter.apply(command);

        IntStream.rangeClosed(start, end).filter(predicate).forEach(n -> System.out.print(n + " "));
    }
}
