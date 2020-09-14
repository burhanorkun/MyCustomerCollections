package com.orkun.collections.LinkedList;

import java.util.HashSet;

public class FindingLoop {

    Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {

        FindingLoop list = new FindingLoop();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);
        // create loop for testing
        list.head.next.next.next.next = list.head;
        if (detectLoop(list.head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }

    private static boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<>();
        while (h!=null){
            if(s.contains(h)){
                return true;
            }
            s.add(h);
            h = h.next;
        }
        return false;
    }
}
