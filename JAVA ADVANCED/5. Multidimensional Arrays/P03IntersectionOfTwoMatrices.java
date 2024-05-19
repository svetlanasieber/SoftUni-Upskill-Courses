package MultidimensionalArrays;

import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());


        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            firstMatrix[i] = scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < rows; i++) {
            secondMatrix[i] = scanner.nextLine().toCharArray();
        }

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                char output = '*';
                if(firstMatrix[i][j] == secondMatrix[i][j]){
                    output = firstMatrix[i][j];
                }
                System.out.print(output);
            }
            System.out.println();
        }
    }
}
