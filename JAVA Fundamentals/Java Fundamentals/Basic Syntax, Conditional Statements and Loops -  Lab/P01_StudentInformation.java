import java.util.Scanner;

public class P01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());


//"Name: {student name}, Age: {student age}, Grade: {student grade}".
        System.out.printf("Name: %s, Age: %s, Grade: %.2f", name, age, averageGrade);
    }
}
