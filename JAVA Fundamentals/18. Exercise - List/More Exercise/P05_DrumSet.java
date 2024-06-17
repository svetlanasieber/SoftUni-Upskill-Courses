import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_DrumSet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayList<Integer> saveDrumSet = new ArrayList<>(drumSet);

        String input = scanner.nextLine();
        while (!"Hit it again, Gabsy!".equals(input)) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - hitPower);
                if (drumSet.get(i) <= 0) {
                    if (!((savings - (saveDrumSet.get(i) * 3.0)) < 0)) {
                        drumSet.set(i, saveDrumSet.get(i));
                        savings -= saveDrumSet.get(i) * 3;
                    } else {
                        drumSet.remove(i);
                        saveDrumSet.remove(i);
                        i--;
                    }
                }
            }
            input = scanner.nextLine();
        }

        drumSet.forEach(e -> System.out.print(e + " "));
        System.out.printf("%nGabsy has %.2flv.", savings);
    }
}
