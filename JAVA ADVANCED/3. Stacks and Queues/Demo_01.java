import java.util.ArrayDeque;

public class Demo_01 {
    public static void main(String[] args) {

        // ArrayList<Integer> numbers = new ArrayList<>();
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        numbersStack.push(1);
        numbersStack.push(2);
        numbersStack.push(3);
        numbersStack.push(4);

        System.out.println(numbersStack.pop());
        System.out.println(numbersStack.pop());
        System.out.println(numbersStack.pop());
        System.out.println(numbersStack.pop());

        System.out.println(numbersStack.peek()); //getting the top element

    }
}
