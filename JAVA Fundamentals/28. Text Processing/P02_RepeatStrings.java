package TextProcessing;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        for (String word : words) {
            System.out.print(repeat(word, word.length()));
        }

    }

    static String repeat(String word, int repetition) {
        char[] repeated = new char[word.length() * repetition];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }

        return new String(repeated);
    }
}
