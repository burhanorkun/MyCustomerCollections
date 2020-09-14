package com.orkun.collections.LinkedList;

public class LinkedListNode {

    int data;

    LinkedListNode next=null;

    public LinkedListNode(int d){
        data = d;
    }

    void appendToTail(int d){
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;

        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    LinkedListNode deleteNode(LinkedListNode head, int d){
        LinkedListNode n = head;
        if(n.data == d)
            return head.next; // moved head

        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head; //head didnt changed
            }
            n = n.next;
        }
        return head;
    }

}
