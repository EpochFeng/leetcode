package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwentySeven
 * @description: TODO
 * @datetime 2026年 05月 28日 9:41
 * @version: 1.0
 */
public class NumberTwentySeven {
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp==null){
                return head;
            }
            temp = temp.next;
        }
        ListNode listNode = reverseKGroup(temp, k);
        ListNode pre = listNode;
        for (int i = 0; i < k; i++) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
