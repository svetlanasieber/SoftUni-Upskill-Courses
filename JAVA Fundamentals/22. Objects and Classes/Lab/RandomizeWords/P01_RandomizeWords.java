import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArry = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < wordsArry.length; i++) {
            int randIndexX = random.nextInt(wordsArry.length);
            int randIndexY = random.nextInt(wordsArry.length);

            String oldWord = wordsArry[randIndexX];
            wordsArry[randIndexX] = wordsArry[randIndexY];
            wordsArry[randIndexY] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArry));
    }
}
