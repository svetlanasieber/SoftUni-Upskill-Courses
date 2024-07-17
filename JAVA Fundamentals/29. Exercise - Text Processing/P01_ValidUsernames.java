import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine()
                                .split(", "); 


        for (String username : usernames) {
            boolean lengthCheck = isValidLength(username);
            boolean contentCheck = isValidContent(username);
            if (lengthCheck && contentCheck) {
                System.out.println(username);
            }
        }
    }

    public static boolean isValidLength (String username) {
        return username.length() >= 3 && username.length() <= 16;
    }

      public static boolean isValidContent (String username) {
        
        for (char symbol : username.toCharArray()) {
            if (symbol != '-' && symbol != '_' && !Character.isLetterOrDigit(symbol)) {
               
                return false;
            }
        }

        return true;
    }
}
