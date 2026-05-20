package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirteen
 * @description: TODO
 * @datetime 2026年 05月 20日 9:54
 * @version: 1.0
 */
public class NumberThirteen {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(temp+nums[i],nums[i]);
            max = Math.max(max,temp);
        }
        return max;
    }
}
