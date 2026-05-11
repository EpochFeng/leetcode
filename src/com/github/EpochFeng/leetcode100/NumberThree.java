package com.github.EpochFeng.leetcode100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 冯纪元
 * @ClassName NumberOne
 * @description: TODO
 * @datetime 2026年 05月 08日 17:27
 * @version: 1.0
 */
public class NumberThree {

    public int longestConsecutive(int[] nums) {
        if (nums.length==0)return 0;
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        temp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
              temp[i] = temp[i-1];
            }else if (nums[i]-nums[i-1]==1){
                temp[i] = temp[i-1]+1;
            }else {
                temp[i]=0;
            }
        }
        return Arrays.stream(temp).max().getAsInt()+1;
    }
    public int longestConsecutive1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (Integer integer : set) {
            if (set.contains(integer-1)){
                continue;
            }
            int i = integer;
            while (set.contains(i+1)){
                i +=1;
            }
            max=Math.max(max,i-integer+1);
        }
        return max;
    }
}
