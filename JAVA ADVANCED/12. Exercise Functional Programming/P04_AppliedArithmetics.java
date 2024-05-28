import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04_AppliedArithmetics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<List<Integer>, List<Integer>> add = list -> list.stream()
                .map(e -> e + 1)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiply = list -> list.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtract = list -> list.stream()
                .map(e -> e - 1)
                .collect(Collectors.toList());


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line;
        while (!"end".equals(line = scanner.nextLine())) {

            switch (line) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                default:
                    numbers.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                    break;
            }
        }

    }
}
