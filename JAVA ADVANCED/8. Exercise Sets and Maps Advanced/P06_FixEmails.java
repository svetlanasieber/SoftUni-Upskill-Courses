import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        String name = scanner.nextLine();
        while (!"stop".equals(name)) {
            String email = scanner.nextLine();
            if (!email.endsWith(".com") && !email.endsWith(".uk") && !email.endsWith(".us")) {
                System.out.printf("%s -> %s%n", name, email);
            }
            name = scanner.nextLine();
        }

    }
}
