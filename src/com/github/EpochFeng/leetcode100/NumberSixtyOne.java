package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberSixtyOne
 * @description: TODO
 * @datetime 2026年 06月 27日 16:12
 * @version: 1.0
 */
public class NumberSixtyOne {
    public List<Integer> partitionLabels(String s) {
        int[] ints = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ints[c-'a'] = i;
        }
        int start =0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int anInt = ints[c - 'a'];
            if (anInt>end) {
                end = anInt;
            }
            if (i==end){
                list.add(end-start+1);
                start = end + 1;
            }

        }
        return list;
    }

}
