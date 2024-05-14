package StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {


        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer popped = stack.pop(); //last element
        System.out.println(popped);

        System.out.println(stack.peek());

    }
}
