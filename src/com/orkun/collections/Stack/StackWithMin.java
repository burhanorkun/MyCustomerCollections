package com.orkun.collections.Stack;

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin> {

    public void push( int value){
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }

    private int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE; // Error value
        }else{
            return peek().min;
        }
    }
}

class NodeWithMin {
    public int value;
    public int min;
    public NodeWithMin(int v, int min){
        value = v;
        this.min = min;
    }
}
