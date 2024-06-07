import java.util.Scanner;

public class P09_PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(isInputPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isInputPalindrome(String input) {

        String reversedString = "";
        for (int index = input.length() - 1; index >= 0; index--) {
            reversedString += input.charAt(index);
        }


        return input.equals(reversedString);
    }
}
