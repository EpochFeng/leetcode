package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwentySix
 * @description: TODO
 * @datetime 2026年 05月 27日 10:32
 * @version: 1.0
 */
public class NumberTwentySix {
  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode next = swapPairs(head.next.next);
        ListNode pre = head.next;
        pre.next = head;
        head.next = next;
        return pre;
    }
}
