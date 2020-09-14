package com.orkun.collections.LinkedList;

public class Sumlists {

    public static void main(String[] args) {

        LinkedListNode a = null;
        LinkedListNode b = null;
        int result = sumLists(a, b);
    }

    private static int sumLists(LinkedListNode a, LinkedListNode b) {

        String s1 = reverseLinkedList(a);
        String s2 = reverseLinkedList(b);

        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }

    private static String reverseLinkedList(LinkedListNode n){
        if(n == null){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        LinkedListNode node = n;
        while (node.next != null){
            builder.append(node.data);
            node = node.next;
        }
        return builder.reverse().toString();
    }
}
