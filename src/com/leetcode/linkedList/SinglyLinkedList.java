package com.leetcode.linkedList;

public class SinglyLinkedList {

    private ListNode head;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(Integer val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public void addToLast(Integer val) {
        ListNode current = head;
        if (head == null) {
            head = new ListNode(val);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(val);
        }
    }

    public void printList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}
