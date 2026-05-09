package com.github.EpochFeng.leetcode100;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 冯纪元
 * @ClassName NumberOne
 * @description: TODO
 * @datetime 2026年 05月 08日 17:27
 * @version: 1.0
 */
public class NumberTwo {

    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>( Arrays.stream(strs).collect(Collectors.groupingBy(x -> {
            char[] charArray = x.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        })).values());

    }
}
