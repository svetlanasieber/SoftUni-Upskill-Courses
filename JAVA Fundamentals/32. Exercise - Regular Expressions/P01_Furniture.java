import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex); 

      
        String input = scanner.nextLine();
        double totalPrice = 0; 

        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")) {
            
            Matcher matcher = pattern.matcher(input);
            

            if (matcher.find()) {
               
                String furnitureName = matcher.group("furnitureName"); 
                double price = Double.parseDouble(matcher.group("price")); 
                int quantity = Integer.parseInt(matcher.group("quantity"));

                System.out.println(furnitureName);
                double pricePerFurniture = price * quantity;
                totalPrice += pricePerFurniture;
            }
            input = scanner.nextLine();
        }

        
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
