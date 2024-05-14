import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayDeque<String> browserHistory = new ArrayDeque<>(); // stack

            String line = null;
            String print;

            while (!"Home".equals(line = scanner.nextLine())) {

                if (line.equals("back")) {
                    if (browserHistory.size() > 1 ) {
                        browserHistory.pop();
                        print = browserHistory.peek();
                    } else {
                        print = "no previous URLs";
                    }
                } else {
                    browserHistory.push(line);
                    print = line;
                }

                System.out.println(print);
            }
        }
    }
