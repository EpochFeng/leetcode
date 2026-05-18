package com.github.EpochFeng.leetcode100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯纪元
 * @ClassName NumberTen
 * @description: TODO
 * @datetime 2026年 05月 17日 18:58
 * @version: 1.0
 */
public class NumberTen {
    public static void main(String[] args) {
        int i = subarraySum1(new int[]{1,2,3}, 3);
    }
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp==k){
                ans++;
            }
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                temp += nums[i1];
                if (temp == k) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int subarraySum1(int[] nums, int k) {
        int ans = 0;
        int[] arry = new int[nums.length+1];
        arry[0]=0;
        for (int i = 0; i < nums.length; i++) {
            arry[i+1] = arry[i]+nums[i];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arry) {
            int i1 = i - k;
            if (map.containsKey(i1)){
                ans+=map.get(i1);
            }
           map.put(i,map.getOrDefault(i,0)+1);
        }
        return ans;
    }

}
