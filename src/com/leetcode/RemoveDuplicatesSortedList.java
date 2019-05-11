package com.leetcode;

import com.leetcode.linkedList.ListNode;
import com.leetcode.linkedList.SinglyLinkedList;


public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(2);
        linkedList.addToFront(3);

        ListNode listNode = deleteDuplicates(linkedList.getHead());
        listNode.print();

    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
