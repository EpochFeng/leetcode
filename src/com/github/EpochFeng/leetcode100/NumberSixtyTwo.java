package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSixtyTwo
 * @description: TODO
 * @datetime 2026年 06月 28日 16:07
 * @version: 1.0
 */
public class NumberSixtyTwo {
    public int climbStairs(int n) {
        int[] arr = new int[46];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
