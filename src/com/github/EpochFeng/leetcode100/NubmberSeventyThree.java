package com.github.EpochFeng.leetcode100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName NubmberSeventyThree
 * @description: TODO
 * @datetime 2026年 07月 07日 10:33 AM
 * @version: 1.0
 */
public class NubmberSeventyThree {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
