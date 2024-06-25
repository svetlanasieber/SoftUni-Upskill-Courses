package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = fillRectangleWithPoints(scanner);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(contains(rectangle, scanner));
        }
    }

    private static Rectangle fillRectangleWithPoints(Scanner scanner) {
        int[] points = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Point bottomLeftPoint = new Point(points[0], points[1]);
        Point topRightPoint = new Point(points[2], points[3]);
        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);
        return rectangle;
    }

    private static boolean contains(Rectangle rectangle, Scanner scanner) {
        int[] pointCoordinate = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int currentX = pointCoordinate[0];
        int currentY = pointCoordinate[1];

        if (!(currentX >= rectangle.getBottomLeftPoint().getX()
                && currentX <= rectangle.getTopRightPoint().getX())) {
            return false;
        }
        if (!(currentY >= rectangle.getBottomLeftPoint().getY()
                && currentY <= rectangle.getTopRightPoint().getY())) {
            return false;
        }
        return true;
    }
}
