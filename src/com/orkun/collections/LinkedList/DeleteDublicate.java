package com.orkun.collections.LinkedList;

import java.util.HashSet;

public class DeleteDublicate {

    public static void main(String[] args) {

        LinkedListNode n = new LinkedListNode(1);
        deleteDups(n);
    }

    private static void deleteDups(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }

    // no buffer allowed
    private static void deleteDups2(LinkedListNode head) {
        LinkedListNode current = head;

        while (current != null) {
            // remove all future nodes that have the same value
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    private static boolean deleteNodeMiddle(LinkedListNode n){
        if(n == null || n.next == null){
            return false;
        }
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
