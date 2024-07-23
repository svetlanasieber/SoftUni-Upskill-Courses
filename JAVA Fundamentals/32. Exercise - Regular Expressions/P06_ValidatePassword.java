import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexPassword = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regexPassword);

        int countPasswords = Integer.parseInt(scanner.nextLine()); 
        for (int count = 1; count <= countPasswords; count++) {
            String password = scanner.nextLine();
        
            Matcher matcher = pattern.matcher(password);
           

            if (matcher.find()) {
               
                String passwordText = matcher.group("passwordText"); 
               
                StringBuilder sbDigits = new StringBuilder(); 
                for (char symbol : passwordText.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                     
                      sbDigits.append(symbol);
                    }
                }

              
                if (sbDigits.isEmpty()) { 
                    System.out.println("Group: default");
                }
           
                else { 
                    System.out.println("Group: " + sbDigits);
                }
            } else {
   
                System.out.println("Invalid pass!");
            }
        }
    }
}
