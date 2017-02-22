package com.wilsonfranca.hackerrank.linkedlist;

/**
 * Created by wilson on 15/02/17.
 */
public class LinkedList {

    Node head;

    boolean hasCycle(Node head) {

        if(head == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (true){

            slow = slow.next;

            if(slow == null) return false;

            if(fast.next != null)
                fast = fast.next.next;
            else
                return false;

            if(slow == null || fast == null) return false;

            if(slow == fast) return true;
        }

    }
}
