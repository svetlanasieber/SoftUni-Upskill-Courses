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