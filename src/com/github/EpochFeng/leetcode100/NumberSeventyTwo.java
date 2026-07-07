package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSeventyTwo
 * @description: TODO
 * @datetime 2026年 07月 07日 10:26 AM
 * @version: 1.0
 */
public class NumberSeventyTwo {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum^=num;
        }
        return sum;
    }
}
