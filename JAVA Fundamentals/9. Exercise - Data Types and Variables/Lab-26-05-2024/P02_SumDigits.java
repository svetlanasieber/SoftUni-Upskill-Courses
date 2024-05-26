import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given a single integer. Your task is to find the sum of its digits

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
       
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        System.out.println(sum);


    }
}
