import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers){
            if(number % 2 == 0){
                evenSum += number;
            }else {
                oddSum += number;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
