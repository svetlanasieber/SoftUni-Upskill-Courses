package GenericBox;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();
        for (int row = 0; row < n; row++) {
            double number = Double.parseDouble(scanner.nextLine());
            box.add(number);
        }
        double valueToCompare = Double.parseDouble(scanner.nextLine());

        System.out.println(box.countGreaterValues(valueToCompare));
    }
}
