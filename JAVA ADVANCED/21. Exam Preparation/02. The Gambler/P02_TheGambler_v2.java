import java.util.*;

public class P02_TheGambler_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        int n = Integer.parseInt(scanner.nextLine());
        
    
        char[][] board = new char[n][n];
        int gamblerRow = -1, gamblerCol = -1;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'G') {
                    gamblerRow = i;
                    gamblerCol = j;
                }
            }
        }
   
        int amount = 100;
        
      
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            
           
            int newRow = gamblerRow, newCol = gamblerCol;
            switch (command) {
                case "up":    newRow--; break;
                case "down":  newRow++; break;
                case "left":  newCol--; break;
                case "right": newCol++; break;
            }
            
          
            if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= n) {
                System.out.println("Game over! You lost everything!");
                return;
            }
            
           
            board[gamblerRow][gamblerCol] = '-';
            gamblerRow = newRow;
            gamblerCol = newCol;
            
           
            switch (board[gamblerRow][gamblerCol]) {
                case '-':
                  
                    break;
                case 'W':
                    amount += 100;
                    break;
                case 'P':
                    amount -= 200;
                    break;
                case 'J':
                    amount += 100000;
                    board[gamblerRow][gamblerCol] = 'G';
                    System.out.println("You win the Jackpot!");
                    System.out.printf("End of the game. Total amount: %d$%n", amount);
                    printBoard(board);
                    return;
            }
            
           
            if (amount <= 0) {
                System.out.println("Game over! You lost everything!");
                return;
            }
            
            
            board[gamblerRow][gamblerCol] = 'G';
        }
        
        // End of the game
        System.out.printf("End of the game. Total amount: %d$%n", amount);
        printBoard(board);
    }
    
    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
