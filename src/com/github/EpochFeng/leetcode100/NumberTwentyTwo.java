package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyTwo
 * @description: TODO
 * @datetime 2026年 05月 25日 11:03
 * @version: 1.0
 */
public class NumberTwentyTwo {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true){
            if (fast==null||fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        while (head!=fast){
            head=head.next;
            fast=fast.next;
        }
        return head;
    }
}
