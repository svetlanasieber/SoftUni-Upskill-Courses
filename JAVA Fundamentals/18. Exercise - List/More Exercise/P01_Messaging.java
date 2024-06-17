import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Messaging {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] inputText = scanner.nextLine().split("");

        List<String> textList = new ArrayList<>();
        List<String> message = new ArrayList<>();

        inputTextToList(textList, inputText);

        for (int i = 0; i < numbersList.size(); i++) {
            int index = sumOfNumberDigits(numbersList.get(i));
            if (index > textList.size() - 1) {
                index = index % (textList.size());
            }
            message.add(textList.get(index));
            textList.remove(index);
        }

        message.forEach(System.out::print);

    }

    private static void inputTextToList(List<String> textList, String[] inputText) {
        for (int i = 0; i < inputText.length; i++) {
            textList.add(i, inputText[i]);
        }
    }

    private static int sumOfNumberDigits(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            sumOfDigits += currentDigit;
            number /= 10;
        }
        return sumOfDigits;
    }

}
