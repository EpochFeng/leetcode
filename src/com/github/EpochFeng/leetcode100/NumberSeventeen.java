package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSeventeen
 * @description: TODO
 * @datetime 2026年 05月 21日 10:02
 * @version: 1.0
 */
public class NumberSeventeen {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int i = firstMissingPositive(nums);
        System.out.println(i);
    }
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=0){
                nums[i] = nums.length+1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (num<nums.length&&nums[num-1]>0){
                nums[num-1] = -nums[num-1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
