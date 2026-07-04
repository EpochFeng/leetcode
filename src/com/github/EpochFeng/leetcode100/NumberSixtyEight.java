package com.github.EpochFeng.leetcode100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName NumberSixtyEight
 * @description: TODO
 * @datetime 2026年 07月 04日 18:41
 * @version: 1.0
 */
public class NumberSixtyEight {
    public int lengthOfLIS(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,1);
        dp[0]=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i+1] = Math.max(dp[i+1],dp[j+1]+1);
                }
            }
            ans = Math.max(ans,dp[i+1]);
        }
        return ans;
    }
}
