package com.github.EpochFeng.leetcode100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName NumberFifteen
 * @description: TODO
 * @datetime 2026年 05月 21日 9:04
 * @version: 1.0
 */
public class NumberFifteen {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);

        }
    }


