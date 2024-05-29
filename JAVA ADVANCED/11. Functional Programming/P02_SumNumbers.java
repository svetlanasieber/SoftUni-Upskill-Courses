import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntSummaryStatistics intSummaryStatistics = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();

        System.out.println("Count = " + intSummaryStatistics.getCount());
        System.out.println("Sum = " + intSummaryStatistics.getSum());
    }
}
