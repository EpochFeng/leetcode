package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSeventyOne
 * @description: TODO
 * @datetime 2026年 07月 06日 4:16 PM
 * @version: 1.0
 */
public class NumberSeventyOne {
    public boolean canPartition(int[] nums) {
        int length = nums.length;
        if (length < 2) return false;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }
        if (sum % 2 != 0) return false;
        int medium = sum / 2;
        if (max > medium) return false;
        boolean[] dp = new boolean[medium + 1];
        dp[0] = true;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            for (int j = medium; j>=num; j--) {
                    dp[j] = dp[j] || dp[j-num];
            }
        }
        return dp[medium];
    }
}
