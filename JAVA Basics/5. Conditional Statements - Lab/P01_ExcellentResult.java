package ConditionalStatementsLab;

import java.util.Scanner;

public class P01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. четем цяло число -> оценка
        //2. проверка: оценка >= 5 -> Excellent!
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5){
            System.out.println("Excellent!");

        }
    }
}
