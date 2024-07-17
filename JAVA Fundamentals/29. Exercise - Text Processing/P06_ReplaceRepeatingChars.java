import java.util.Scanner;

public class P06_ReplaceRepeatCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text); 
        for (int position = 0; position < textBuilder.length() - 1; position++) {
            
            if (textBuilder.charAt(position) == textBuilder.charAt(position + 1)) {
                textBuilder.deleteCharAt(position + 1); 
                position--; 
            }
        }

        System.out.println(textBuilder);



    }
}
