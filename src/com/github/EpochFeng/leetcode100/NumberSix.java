package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberSix
 * @description: TODO
 * @datetime 2026年 05月 13日 9:28
 * @version: 1.0
 */
public class NumberSix {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i>0&&nums[i-1]==nums[i])continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;right--;
                    while (left<right&&nums[left]==nums[left-1])left++;
                    while (left<right&&nums[right+1]==nums[right])right--;
                }
            }
        }
        return lists;
    }
}
