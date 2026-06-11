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
        int left = 0;
        int right = nums.length-1;
        int temp = -1;
        while (left<=right){
            int middle = (left + right) / 2;
            if (nums[middle]==target){
                temp = middle;
                break;
            }else if (nums[middle]<target){
                left=middle+1;
            }else {
                right= middle-1;
            }
        }
        if (temp==-1)return new int[]{-1,-1};
        int[] ints = new int[2];
        for (int i = temp; i < nums.length; i++) {
            while (nums[i]!=target){
               i++;
            }
            ints[1] = i-1;
            break;
        }
        for (int i = temp; i >= 0; i--) {
            while (nums[i]!=target){
             i--;
            }
            ints[0]=i+1;
            break;
        }
        return ints;
    }
}
