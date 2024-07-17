import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String input = scanner.nextLine();
        String firstText = input.split(" ")[0]; 
        String secondText = input.split(" ")[1]; 

        printSumCharacters(firstText, secondText);
    }

    private static void printSumCharacters(String firstText, String secondText) {
      
        int minLength = Math.min(firstText.length(), secondText.length()); 
        int sum = 0;
        for (int position = 0; position <= minLength - 1; position++) {
            char symbolFirstText = firstText.charAt(position);
            char symbolSecondText = secondText.charAt(position);

            int multiplication = symbolFirstText * symbolSecondText;
            sum += multiplication;
        }

        if (firstText.length() == secondText.length()) {
            System.out.println(sum);
        }
     
        else if (firstText.length() > secondText.length()) {
          
            for (int position = minLength; position <= firstText.length() - 1; position++) {
                char currentSymbol = firstText.charAt(position);
                sum += currentSymbol;
            }
           
            System.out.println(sum);
        }
       
        else { 

            for (int position = minLength; position <= secondText.length() - 1; position++) {
                char currentSymbol = secondText.charAt(position);
                sum += currentSymbol;
            }
   
            System.out.println(sum);
        }

    }
}
