package com.github.EpochFeng.leetcode100;

import java.util.*;

/**
 * @author 冯纪元
 * @ClassName NumberTwelve
 * @description: TODO
 * @datetime 2026年 05月 19日 16:28
 * @version: 1.0
 */
public class NumberTwelve {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String p = "ABC";
        String s1 = minWindow(s, p);
        System.out.println(s1);
    }
    public static String minWindow(String s, String t) {
        int min = Integer.MIN_VALUE;
        List<String> list = new ArrayList<>();
        char[] charArray = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            if (isbig(map)){
                continue;
            }
            while (left<=i&&isSmall(map)){
                list.add(s.substring(left,i+1));
                char c1 = s.charAt(left);
                if (map.containsKey(c1)){
                    map.put(c1,map.get(c1)+1);
                }
                left++;
            }
        }
        if (list.isEmpty())return "";
        return list.stream().min(Comparator.comparingInt(String::length)).get();
    }
    public static boolean isbig(Map<Character,Integer> map){
        return map.values().stream().anyMatch(x->x>0);
    }
    public static boolean isSmall(Map<Character,Integer> map){
        return map.values().stream().allMatch(x->x<=0);
    }
}
