package com.github.EpochFeng.leetcode100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyOne
 * @description: TODO
 * @datetime 2026年 05月 23日 20:02
 * @version: 1.0
 */
public class NumberTwentyOne {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while (temp!=null){
            if (set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
    public boolean hasCycle1(ListNode head) {
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow==fast){
            if(fast!=null&&fast.next!=null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
