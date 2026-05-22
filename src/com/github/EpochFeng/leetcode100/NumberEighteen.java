package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberEighteen
 * @description: TODO
 * @datetime 2026年 05月 22日 10:44
 * @version: 1.0
 */
public class NumberEighteen {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA!=tempB){
            tempA = tempA == null ? headB : tempA.next;
            tempB = tempB == null ? headA : tempB.next;
        }
        return tempB;
    }

      class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

