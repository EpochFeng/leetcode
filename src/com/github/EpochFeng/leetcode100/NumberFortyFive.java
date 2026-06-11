package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortyFive
 * @description: TODO
 * @datetime 2026年 06月 11日 16:10
 * @version: 1.0
 */
public class NumberFortyFive {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int middle = (left + right) / 2;
            if (nums[middle]==target){
                return middle;
            }else if (nums[middle]<target){
                left=middle+1;
            }else {
                right= middle-1;
            }
        }
        return left;
    }
}
