import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class P07_FindTheSmallestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findTheSmallestEl = arr -> {
            int smallestNumber = Integer.MAX_VALUE;
            int idx = 0;

            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                if (current <= smallestNumber) {
                    smallestNumber = arr[i];
                    idx = i;
                }
            }

            return idx;
        };

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int smallestNumberIndex = findTheSmallestEl.apply(numbers);

        System.out.println(smallestNumberIndex);
    }
}
