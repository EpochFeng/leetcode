package com.github.EpochFeng.leetcode100;

import java.util.*;

/**
 * @author 冯纪元
 * @ClassName NumberFiftySix
 * @description: TODO
 * @datetime 2026年 06月 26日 22:34
 * @version: 1.0
 */
public class NumberFiftySix {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Integer max = Collections.max(map.values());
        List<Integer>[] bukets = new List[max+1];
        Arrays.setAll(bukets, x -> new ArrayList<>());
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            bukets[value].add(integerIntegerEntry.getKey());
        }
        int[]  arr = new int[k];
        int index = 0;
        for (int i = max;index<k;i--){
            for (Integer integer : bukets[i]) {
                arr[index++] = integer;
            }
        }
        return arr;
    }
}
