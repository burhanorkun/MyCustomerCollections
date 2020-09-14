package com.orkun.collections.LinkedList;

public class Palindrome {

    public static void main(String[] args) {

        LinkedListNode node = new LinkedListNode(3);
        node.appendToTail(5);
        node.appendToTail(6);
        node.appendToTail(5);
        node.appendToTail(3);
        //node.appendToTail(3);
        boolean isPalidrom = isPalidrom(node);
        System.out.println("isPalidrom: " + isPalidrom);
    }

    private static boolean isPalidrom(LinkedListNode head) {
        LinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    private static LinkedListNode reverseAndClone(LinkedListNode node) {
        LinkedListNode head = null;
        while (node != null) {
            LinkedListNode n = new LinkedListNode(node.data); // clone
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    private static boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.data != two.data)
                return false;
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

}
