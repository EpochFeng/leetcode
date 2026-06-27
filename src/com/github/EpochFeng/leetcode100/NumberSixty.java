package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSixty
 * @description: TODO
 * @datetime 2026年 06月 27日 15:34
 * @version: 1.0
 */
public class NumberSixty {
    public int jump(int[] nums) {
        if (nums.length==1)return 0;
        int length = nums.length;
        int right = 0;
        int max = 0;
        int count=0;
        for (int i = 0; i < length; i++) {
            if (i<=right){
                max= Math.max(max,i+nums[i]);
                if (i==right){
                    right = max;
                    count++;
                }
            }
            if (right>=length-1) break;
        }
        return count;
    }
}
