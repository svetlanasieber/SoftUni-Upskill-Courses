package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        number = number % 10;
        String nameEnglish = "";
        switch (number) {
            case 1:
                nameEnglish = "one";
                break;
            case 2:
                nameEnglish = "two";
                break;
            case 3:
                nameEnglish = "three";
                break;
            case 4:
                nameEnglish = "four";
                break;
            case 5:
                nameEnglish = "five";
                break;
            case 6:
                nameEnglish = "six";
                break;
            case 7:
                nameEnglish = "seven";
                break;
            case 8:
                nameEnglish = "eight";
                break;
            case 9:
                nameEnglish = "nine";
                break;
            case 0:
                nameEnglish = "zero";
                break;
        }
        System.out.println(nameEnglish);
    }
}
