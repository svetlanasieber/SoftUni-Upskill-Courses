package ForLoopLab;

import java.util.Scanner;

public class Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // for (int i = 1; i <= 12 ; i++) {
       //     System.out.println(i);
       // }
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }

    }
}
