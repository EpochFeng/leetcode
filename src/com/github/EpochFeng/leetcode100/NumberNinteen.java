package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberNinteen
 * @description: TODO
 * @datetime 2026年 05月 22日 10:58
 * @version: 1.0
 */
public class NumberNinteen {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3= new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        reverse(listNode1);
        System.out.println(listNode1);
    }
     static class ListNode {
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
    public ListNode reverseList(ListNode head) {
            ListNode newNode =null;
            ListNode pre = head;
            while (pre!=null){
                ListNode next = pre.next;
                pre.next = newNode;
                newNode = pre;
                pre = next;
            }
            return newNode;
    }
    public  static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode reverse = reverse(next);
        next.next = head;
        head.next = null;
        return reverse;
    }
}
