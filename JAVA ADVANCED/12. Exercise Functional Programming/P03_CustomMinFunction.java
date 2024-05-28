import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_CustomMinFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findTheSmallestNumber = arr -> Arrays.stream(arr).min(Integer::compare).get();

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int smallestNumber = findTheSmallestNumber.apply(numbers);

        System.out.println(smallestNumber);

    }
}
