package textProcessing;

import java.util.Scanner;

public class P05_DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); //"Agd#53Dfg^&4F53"

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
            
              digits.append(symbol);
            } else if (Character.isLetter(symbol)) {
               
                letters.append(symbol);
            } else {
               
                others.append(symbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters.toString());
        System.out.println(others.toString());

    }
}
