package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSeventySix
 * @description: TODO
 * @datetime 2026年 07月 08日 4:23 PM
 * @version: 1.0
 */
public class NumberSeventySix {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while(pre1 != pre2){
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }


}
