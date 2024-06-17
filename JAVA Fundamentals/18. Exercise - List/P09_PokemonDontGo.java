import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_PokemonDontGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemovedElements = 0;

        while (!numbersList.isEmpty()) {
            int inputIndex = Integer.parseInt(scanner.nextLine());
            int removedElement = 0;
			
            if (inputIndex > numbersList.size() - 1) {
                removedElement = numbersList.get(numbersList.size() - 1);
                numbersList.set(numbersList.size() - 1, numbersList.get(0));
            } else if (inputIndex < 0) {
                removedElement = numbersList.get(0);
                numbersList.set(0, numbersList.get(numbersList.size() - 1));
            } else {
                removedElement = numbersList.get(inputIndex);
                numbersList.remove(inputIndex);
            }
			
            for (int i = 0; i < numbersList.size(); i++) {
                if (numbersList.get(i) <= removedElement) {
                    numbersList.set(i, numbersList.get(i) + removedElement);
                } else {
                    numbersList.set(i, numbersList.get(i) - removedElement);
                }
            }

            sumOfRemovedElements += removedElement;
        }

        System.out.println(sumOfRemovedElements);
    }

}
