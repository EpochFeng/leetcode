package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyEight
 * @description: TODO
 * @datetime 2026年 05月 29日 14:25
 * @version: 1.0
 */
public class NumberTwentyEight {
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

    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        ListNode pre = new ListNode();
        ListNode preTemp = pre;
        list.sort(Integer::compareTo);
        for (int i = 0; i < list.size(); i++) {
            ListNode newNode = new ListNode(list.get(i));
            preTemp.next = newNode;
            preTemp = preTemp.next;
        }
        return pre.next;
    }
    public ListNode sortList1(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode separate = separate(head);
        ListNode listNode1 = sortList1(head);
        ListNode listNode = sortList1(separate);
        ListNode merge = merge(listNode1, listNode);
        return merge;
    }
    public ListNode separate(ListNode head){
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return slow;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode preTemp = new ListNode();
        ListNode pre = preTemp;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (temp1!=null&&temp2!=null){
            if (temp1.val<temp2.val){
                pre.next = temp1;
                temp1 = temp1.next;
            }else {
                pre.next = temp2;
                temp2 = temp2.next;
            }
            pre = pre.next;
        }
        pre.next = temp1==null?temp2:temp1;
        return preTemp.next;
    }
}
