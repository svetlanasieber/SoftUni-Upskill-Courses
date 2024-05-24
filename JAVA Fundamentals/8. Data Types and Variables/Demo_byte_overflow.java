package DataTypesVariablesLab;

import java.util.Scanner;

public class Demo_byte_overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Integers have range (minimal and maximal value)
        //Integers could overflow  this leads to incorrect values

        byte counter = 0;
        for (int i = 0; i < 130; i++) {
            counter++;
            System.out.println(counter);
        }

    }
}
