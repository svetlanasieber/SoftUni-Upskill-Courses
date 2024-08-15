import java.util.Scanner;

public class P00_Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println(array.length);

        array[0] = 4;
        array[1] = 6;
        array[2] = 9;

        System.out.println(array[2]);
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);

        String name = "Desi";
        //"Desi".toCharArray() -> ['D', 'e', 's', 'i']
        char[] letters = name.toCharArray();
        System.out.println(letters[0]);
        System.out.println(letters[letters.length - 1]);

    }
}
