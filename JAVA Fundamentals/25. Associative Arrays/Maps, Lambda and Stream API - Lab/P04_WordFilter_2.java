import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                         .filter(word -> word.length() % 2 == 0) 
                          .toArray(String[] :: new);

        //1 version -> StreamAPI
        //words = ["kiwi", "orange", "banana"]
        //Arrays.stream(words).forEach(word -> System.out.println(word));

        //2 version -> foreach
        for (String word : words) {
            System.out.println(word);
        }

    }
}
