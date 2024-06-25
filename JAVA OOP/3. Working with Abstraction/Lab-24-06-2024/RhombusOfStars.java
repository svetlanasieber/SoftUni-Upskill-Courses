import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String emptyPlaces = putEmptyPlaces(n);

        printTopPartRhombus(emptyPlaces, n);
        printBottomPartRhombus(emptyPlaces, n);
    }

    private static void printTopPartRhombus(String emptyPlaces, int n) {
        int length = emptyPlaces.length();
        for (int i = 1; i <= n; i++) {

            emptyPlaces = emptyPlaces.substring(0, length - i);
            System.out.print(emptyPlaces);
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printBottomPartRhombus(String emptyPlaces, int n) {
        int length = emptyPlaces.length();
        emptyPlaces = " ";
        for (int i = 1; i < n; i++) {

            System.out.print(emptyPlaces);
            for (int j = n - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            emptyPlaces += " ";
        }
    }

    public static String putEmptyPlaces(int n) {
        String emptyPlaces = "";
        for (int i = 0; i < n; i++) {
            emptyPlaces += " ";
        }
        return emptyPlaces;
    }
}
