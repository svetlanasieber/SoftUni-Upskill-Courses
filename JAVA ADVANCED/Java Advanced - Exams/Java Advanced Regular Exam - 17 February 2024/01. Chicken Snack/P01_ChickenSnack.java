import java.util.*;
import java.util.stream.Collectors;

public class P01_ChickenSnack {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        Stack<Integer> money = new Stack<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(money::push);

        Queue<Integer> prices = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList::new));

        int count = 0;

        while (!money.isEmpty() && !prices.isEmpty()) {


            int currentMoney = money.peek();
            int currentPrice = prices.peek();

            if (currentMoney == currentPrice) {
                money.pop();
                prices.poll();
                count++;
            } else if (currentMoney > currentPrice) {
                int change = currentMoney - currentPrice;
                money.pop();
                if(!money.empty()) {
                    money.push(money.pop() + change);
                }
                prices.poll();
                count++;
            } else {
                money.pop();
                prices.poll();
            }
        }

        if(count >= 4) {
            System.out.println("Gluttony of the day! Henry ate " + count + " foods.");
        }
        if(count == 0) {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }
        if(count < 4 && count != 0) {
            System.out.print("Henry ate: " + count + (count == 1 ? " food." : " foods."));
        }
    }
}
