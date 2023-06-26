package ru.pufr;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println(stack.pop());



    }
}