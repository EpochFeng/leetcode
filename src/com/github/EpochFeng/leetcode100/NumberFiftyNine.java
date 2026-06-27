package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyNine
 * @description: TODO
 * @datetime 2026年 06月 27日 15:21
 * @version: 1.0
 */
public class NumberFiftyNine {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int right = 0;
        for (int i = 0; i < length; i++) {
            if (i<=right){
                right=Math.max(right,i+nums[i]);
            }
            if (right>=length-1) return true;
        }
        return false;
    }
}
