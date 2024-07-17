package AssociativeArrays_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> students = new HashMap<>();
        students.put("Ivan", 5.50);
        students.put("Stoyan", 3.80);
        students.put("Georgi", 4.20);

        System.out.println(students.size());

    }
}
