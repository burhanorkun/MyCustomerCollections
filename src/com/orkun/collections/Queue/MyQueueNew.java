package com.orkun.collections.Queue;

import java.util.Stack;

public class MyQueueNew<T> {
    Stack<T> stackNewest, stackOldest;

    public MyQueueNew(){
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void add(T value){
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public T peek(){
        shiftStacks();
        return stackOldest.peek();
    }

    public T remove(){
        shiftStacks();
        return stackOldest.pop(); //pop the oldest item
    }
}
