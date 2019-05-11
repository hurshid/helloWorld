package com.leetcode.linkedList;

public class ListNode {
    public ListNode next;
    public int val;

    ListNode(int val) {
        this.val = val;
    }

    public void print() {
        ListNode node = this;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}


