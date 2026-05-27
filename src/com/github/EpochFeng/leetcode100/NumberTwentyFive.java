package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyFive
 * @description: TODO
 * @datetime 2026年 05月 27日 10:17
 * @version: 1.0
 */
public class NumberTwentyFive {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode newNode = new ListNode();
        ListNode tail = head;
        newNode.next = head;
        ListNode pre = newNode;
        for (int i = 0; i < n; i++) {
            tail = tail.next;
        }
        while (tail!=null){
            tail = tail.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return newNode.next;
    }
}
