package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyThree
 * @description: TODO
 * @datetime 2026年 05月 25日 14:33
 * @version: 1.0
 */
public class NumberTwentyThree {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode temp1 = list1;
            ListNode temp2 = list2;
            ListNode head = new ListNode();
            ListNode temp = head;
            while (temp1!=null&&temp2!=null){
                if (temp1.val<temp2.val){
                    ListNode newNode = new ListNode(temp1.val);
                    temp.next = newNode;
                    temp1 = temp1.next;
                }else {
                    ListNode newNode = new ListNode(temp2.val);
                    temp.next = newNode;
                    temp2 = temp2.next;
                }
                temp = temp.next;
            }
            temp.next = temp1==null?temp2:temp1;
            return head.next;
    }
}
