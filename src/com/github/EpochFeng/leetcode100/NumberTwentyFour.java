package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyFour
 * @description: TODO
 * @datetime 2026年 05月 26日 10:59
 * @version: 1.0
 */
public class NumberTwentyFour {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int amount = 0;
        while (l1 != null && l2 != null) {
            int i = l1.val + l2.val;
            ListNode newNode = new ListNode((i + amount) % 10);
            amount = (i + amount) / 10;
            temp.next = newNode;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
                ListNode newNode = new ListNode((l1.val + amount) % 10);
                amount = (l1.val + amount) / 10;
                temp.next = newNode;
                temp = temp.next;
                l1 = l1.next;
            }
        }else if (l2 != null) {
            while (l2 != null) {
                ListNode newNode = new ListNode((l2.val + amount) % 10);
                amount = (l2.val + amount) / 10;
                temp.next = newNode;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (amount==1){
            ListNode newNode = new ListNode(1);
            temp.next = newNode;
        }
        return head.next;
    }
}
