package cards;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if ("Card Suits".equals(input)) {
            System.out.println("Card Suits:");
            for (CardSuit suit : CardSuit.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", suit.getValue(), suit.name());
            }
        } else {
            System.out.println("Invalid input. Please enter 'Card Suits' to see the list of card suits.");
        }
    }
}



