import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = calculateRectangleArea(width, length);

        System.out.println(area);

    }

    public static int calculateRectangleArea(int width, int length){
        return width * length;
    }
}
