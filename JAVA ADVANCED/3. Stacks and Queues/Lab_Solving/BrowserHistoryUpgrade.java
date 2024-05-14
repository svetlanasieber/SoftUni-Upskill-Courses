import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class BrowserHistoryUpgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backHistory = new ArrayDeque<>(); // stack
        ArrayDeque<String> forwardHistory = new ArrayDeque<>(); // queue

        String line;
        String print;

        while (!"Home".equals(line = scanner.nextLine())) {

            if (line.equals("back")) {
                if (backHistory.size() < 2) {
                    print = "no previous URLs";
                } else {
                    forwardHistory.addFirst(backHistory.pop());
                    print = backHistory.peek();
                }
            } else if (line.equals("forward")) {
                if (forwardHistory.size() < 1) {
                    print = "no next URLs";
                } else {
                    print = forwardHistory.peek();
                    backHistory.push(forwardHistory.poll());
                }
            }else {
                backHistory.push(line);
                print = line;
                forwardHistory.clear();
            }

            System.out.println(print);
        }
    }
}
