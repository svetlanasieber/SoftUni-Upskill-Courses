import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (elements.contains(bomb)) {
            int elementIndex = elements.indexOf(bomb);

            int start = Math.max(elementIndex - power, 0);
            int end = Math.min(elementIndex + power, elements.size() - 1);

            for (int i = end; i >= start; i--) {
                elements.remove(start);
            }
        }

        int sum = 0;
        for (Integer element : elements) {
            sum += element;
        }
        System.out.println(sum);
    }
}
