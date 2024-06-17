import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(strings);

        StringBuilder text = new StringBuilder();

        for (String string : strings) {
            text.append(string);
            text.append(" ");
        }
		
        text = new StringBuilder(text.toString().trim());

        List<Integer> numbers = Arrays.stream(text.toString().split("\\s+")).map(Integer::parseInt).toList();

        for (int num : numbers) {
            System.out.printf("%d ", num);
        }
    }
}
