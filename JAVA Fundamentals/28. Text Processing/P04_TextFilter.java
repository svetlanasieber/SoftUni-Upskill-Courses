package TextProcessing;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] keyWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();
        for (int i = 0; i < keyWords.length; i++) {
            int index = text.indexOf(keyWords[i]);
            String replaceText = "";
            for (int j = 0; j < keyWords[i].length(); j++) {
                replaceText += "*";
            }
            while (index != -1) {
                text = text.replace(keyWords[i], replaceText);
                index = text.indexOf(keyWords[i]);

            }

        }
        System.out.println(text);
    }
}
