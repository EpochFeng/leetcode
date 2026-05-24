package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTwenty
 * @description: TODO
 * @datetime 2026年 05月 23日 19:17
 * @version: 1.0
 */
public class NumberTwenty {
    NumberNinteen.ListNode temp;

    public boolean isPalindrome(NumberNinteen.ListNode head) {
        temp = head;
        return check(head);
    }

    private boolean check(NumberNinteen.ListNode head) {
        if (head == null)
            return true;
        boolean res = check(head.next) && (temp.val == head.val);
        temp = temp.next;
        return res;
    }
    public boolean isPalindrome1(NumberNinteen.ListNode head) {
        if(head==null&&head.next==null){
            return true;
        }
        NumberNinteen.ListNode slowy = head;
        NumberNinteen.ListNode fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slowy = slowy.next;
            fast =  fast.next.next;
        }
        NumberNinteen.ListNode next = slowy.next;
        NumberNinteen.ListNode newNode = null;
        while (next!=null){
            NumberNinteen.ListNode end = next.next;
            next.next = newNode;
            newNode = next;
            next = end;
        }
        while (newNode!=null){
            if (head.val!=newNode.val){
                return false;
            }
            head = head.next;
            newNode = newNode.next;
        }
        return true;
    }

}
