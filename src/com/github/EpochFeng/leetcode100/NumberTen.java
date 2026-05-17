package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberTen
 * @description: TODO
 * @datetime 2026年 05月 17日 18:58
 * @version: 1.0
 */
public class NumberTen {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp==k){
                ans++;
            }
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                temp += nums[i1];
                if (temp == k) {
                    ans++;
                }
            }
        }
        return ans;
    }


}
