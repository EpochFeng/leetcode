package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSixtyFour
 * @description: TODO
 * @datetime 2026年 06月 29日 2:38 PM
 * @version: 1.0
 */
public class NumberSixtyFour {
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}
