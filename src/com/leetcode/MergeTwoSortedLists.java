package com.leetcode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);


        ListNode listNode = mergeTwoLists(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head;
        if (l1.val < l2.val) {
            head = l1;
        } else {
            head = l2;
            l2 = l1;
            l1 = head;
        }
        ListNode temp;
        while (l1.next != null) {
            if (l1.next.val > l2.val) {
                temp = l1.next;
                l1.next = l2;
                l2 = temp;
            }
            l1 = l1.next;
        }
        l1.next = l2;
        return head;
    }
}
