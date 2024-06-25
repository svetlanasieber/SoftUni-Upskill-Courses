package CardSuit;


import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);


        System.out.println("Card Suits:");
        Arrays.stream(Deck.values()).sorted(Comparator.comparing(Enum::name))
                .forEach(d -> System.out.printf("Ordinal value: %d; Name value: %s\n", d.ordinal(), d.name()));


    }
}
