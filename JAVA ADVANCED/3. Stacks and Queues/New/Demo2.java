package StackAndQueuesLab;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        // create a stack
        Stack<Integer> stack = new Stack<>();

        // push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // pop elements from the stack
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // create a queue
        Queue<Integer> queue = new LinkedList<>();

        // add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // remove elements from the queue
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
//In this example, we create a stack and push three elements onto it.
// We then pop the elements from the stack and print them in reverse order (3, 2, 1).
// We also create a queue and add three elements to it.
// We then remove the elements from the queue and print them in the order they were added (1, 2, 3)