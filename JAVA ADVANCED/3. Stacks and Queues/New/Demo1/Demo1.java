package StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {


        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(3));
        // stack.

        Integer popped = stack.pop(); //last element
        System.out.println(popped);

        System.out.println(stack.peek());

    }
}
