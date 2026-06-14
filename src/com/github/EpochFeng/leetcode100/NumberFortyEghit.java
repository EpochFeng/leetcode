package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortyEghit
 * @description: TODO
 * @datetime 2026年 06月 14日 14:10
 * @version: 1.0
 */
public class NumberFortyEghit {
    public int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while (start<=end){
                int middle = (start + end) / 2;
                if (target==nums[middle]) return middle;
                if (nums[start]<=nums[middle]){
                   if (target<nums[middle]&&target>=nums[start]){
                       end=middle-1;
                   }else {
                       start = middle+1;
                   }
                }else {
                    if (target>nums[middle]&&target<=nums[end]){
                        start = middle+1;
                    }else {
                        end = middle-1;
                    }
                }
            }
            return -1;
    }
}
