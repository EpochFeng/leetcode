package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortyNine
 * @description: TODO
 * @datetime 2026年 06月 14日 14:31
 * @version: 1.0
 */
public class NumberFortyNine {
    public int findMin(int[] nums) {
            int start = 0;
            int end = nums.length-1;
            int ans =Integer.MAX_VALUE;
            while (start<=end){
                int middle = (start + end) / 2;
                if (nums[start]<=nums[middle]){
                    ans = Math.min(ans,nums[start]);
                    start = middle+1;
                }else {
                    ans = Math.min(ans,nums[middle]);
                    end =middle-1;
                }
            }
         return ans;
    }
}
