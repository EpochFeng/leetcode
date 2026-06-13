package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortySeven
 * @description: TODO
 * @datetime 2026年 06月 11日 16:56
 * @version: 1.0
 */
public class NumberFortySeven {
    public int[] searchRange(int[] nums, int target) {
       if (nums==null||nums.length==0) return new int[]{-1,-1};
        int left = searchRange1(nums, target, true);
        if (left==-1)return new int[]{-1,-1} ;
        int right = searchRange1(nums, target, false);
        return new int[]{left,right};
    }
    public int searchRange1(int[] nums, int target,boolean flag) {
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while (left<=right){
            int middle = (left + right) / 2;
            if (nums[middle]==target){
                ans = middle;
                if (flag){
                    right=middle-1;
                }else {
                    left = middle+1;
                }
            }else if (nums[middle]<target){
                left = middle+1;
            }else {
                right = middle-1;
            }
        }
        return ans;
    }
}
