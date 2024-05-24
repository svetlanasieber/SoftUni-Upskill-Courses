package ConditionalStatementsLab;

import java.util.Scanner;

public class P07_AreaOfFigures {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String figure = scanner.nextLine();

            double area = 0;

            switch (figure) {
                case "square" -> {
                    double squareSide = Double.parseDouble(scanner.nextLine());
                    area = squareSide * squareSide;
                }
                case "rectangle" -> {
                    double sideA = Double.parseDouble(scanner.nextLine());
                    double sideB = Double.parseDouble(scanner.nextLine());
                    area = sideA * sideB;
                }
                case "circle" -> {
                    double radius = Double.parseDouble(scanner.nextLine());
                    area = radius * radius * Math.PI;
                }
                case "triangle" -> {
                    double sideA = Double.parseDouble(scanner.nextLine());
                    double ha = Double.parseDouble(scanner.nextLine());
                    area = sideA * ha / 2;
                }
            }


            System.out.printf("%.3f", area);

        }
    }

