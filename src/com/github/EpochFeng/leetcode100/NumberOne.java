package com.github.EpochFeng.leetcode100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯纪元
 * @ClassName NumberOne
 * @description: TODO
 * @datetime 2026年 05月 08日 17:27
 * @version: 1.0
 */
public class NumberOne {

    public int[] twoSum(int[] nums, int target) {
        int[] arry = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return arry;
    }
}
