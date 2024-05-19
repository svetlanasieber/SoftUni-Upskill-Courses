package MultidimensionalArrays;

import java.util.Scanner;

public class P07FindTheRealQueen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rows = 8;
        int cols = 8;

        char[][] chessTable = readMatrix(rows, cols, scan);

        for (int row = 0; row < chessTable.length; row++) {
            for (int elem = 0; elem < chessTable[row].length; elem++) {
                char currentElement = chessTable[row][elem];

                if (currentElement == 'q') {
                    if (check(chessTable, row, elem)) {
                        System.out.print(row + " ");
                        System.out.print(elem);

                    }

                }
            }
        }


    }

    private static char[][] readMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] line = scan.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                char currentChar = line[col].charAt(0);
                matrix[row][col] = currentChar;
            }

        }


        return matrix;
    }

    private static boolean check(char[][] chessTable, int row, int elem) {

        for (int i = elem + 1; i < chessTable[row].length; i++) { //RightHorizontal yes
            char charToCheck = chessTable[row][i];

            if (charToCheck == 'q') {
                return false;
            }
        }

        for (int i = elem - 1; i >= 0; i--) { //LeftHorizontal yes
            char charToCheck = chessTable[row][i];

            if (charToCheck == 'q') {
                return false;
            }
        }


        for (int i = row + 1; i < chessTable.length; i++) { //DownVertical yes
            char charToCheck = chessTable[i][elem];

            if (charToCheck == 'q') {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) { // UpVertical yes
            char charToCheck = chessTable[i][elem];

            if (charToCheck == 'q') {
                return false;
            }
        }

        int uldElement = elem - 1;

        for (int i = row - 1; i >= 0 && uldElement >= 0; i--, uldElement--) { // UpLeftDiagonal yes
            char charToCheck = chessTable[i][uldElement];

            if (charToCheck == 'q') {
                return false;
            }
        }


        int urdElement = elem + 1;

        for (int i = row - 1; i >= 0 && urdElement < chessTable[i].length; i--, urdElement++) { // UpRightDiagonal yes
            char charToCheck = chessTable[i][urdElement];

            if (charToCheck == 'q') {
                return false;
            }
        }


        int element = elem - 1;

        for (int i = row + 1; i < chessTable.length && element >= 0; i++, element--) { // DownLeftDiagonal
            char charToCheck = chessTable[i][element];

            if (charToCheck == 'q') {
                return false;
            }
        }

        int element1 = elem + 1;

        for (int i = row + 1; i < chessTable.length && element1 < chessTable[row].length; i++, element1++) { // DownRightDiagonal
            char charToCheck = chessTable[i][element1];

            if (charToCheck == 'q') {
                return false;
            }
        }

        return true;
    }
}
