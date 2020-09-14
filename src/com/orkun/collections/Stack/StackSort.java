package com.orkun.collections.Stack;

import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        int[] array = {2, 5, 10, 3, 11, 7, 13, 8, 9, 4, 1, 6};
        Stack<Integer> s1 = new Stack<Integer>();
        //int[] array = {2,4,1,6};
        for (int i = 0; i < array.length; i++) {
            s1.push(array[i]);
        }
        //displayStack(s1);
        displayStack(sortStack(s1));
    }

    public static Stack<Integer> sortStack(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();
        while (!s1.isEmpty()) {
            int temp = s1.pop();
            while (!s2.isEmpty() && s2.peek() > temp) {
                s1.push(s2.pop());
            }
            s2.push(temp);
        }
        return s2;
    }

    void sort(Stack<Integer> s) {
        Stack<Integer> s2 = new Stack<>();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!s2.isEmpty() && s2.peek() < tmp) {
                s.push(s2.pop());
            }
            s2.push(tmp);
        }
    }

    public static void displayStack(Stack<Integer> s) {
        while (!s.isEmpty())
            System.out.print(s.pop() + "->");
        System.out.println("end");
    }
}
