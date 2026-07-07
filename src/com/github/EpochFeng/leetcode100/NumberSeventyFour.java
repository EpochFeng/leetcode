package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSeventyFour
 * @description: TODO
 * @datetime 2026年 07月 07日 11:03 AM
 * @version: 1.0
 */
public class NumberSeventyFour {
    public void sortColors(int[] nums) {
        int left = 0,right = nums.length-1;
        int i=0;
        while (i<=right){
            while (i<right&&nums[i]==2){
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            }
            if (nums[i]==0){
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
            }
            i++;
        }
    }
}
