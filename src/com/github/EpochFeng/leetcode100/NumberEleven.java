package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;

/**
 * @author 冯纪元
 * @ClassName NumberEleven
 * @description: TODO
 * @datetime 2026年 05月 18日 9:38
 * @version: 1.0
 */
public class NumberEleven {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] arry = new int[length-k+1];
        for (int i = 0; i < arry.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                max = Math.max(max,nums[i+j]);
            }
            arry[i] = max;
        }
        return arry;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        int[] arry = new int[nums.length-k+1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0,j=i-k; i < nums.length; i++,j++) {
            if (j>=0&&queue.getFirst()==nums[j]){
                queue.removeFirst();
            }
            while (queue.size()>0&&queue.getLast()<nums[i]){
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            if (i>=k-1){
                arry[i-k+1] = queue.getFirst();
            }
        }
        return arry;
    }
}
