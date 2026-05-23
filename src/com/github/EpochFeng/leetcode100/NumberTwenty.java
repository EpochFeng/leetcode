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


}
