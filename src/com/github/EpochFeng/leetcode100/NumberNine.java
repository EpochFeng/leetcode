package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberNine
 * @description: TODO
 * @datetime 2026年 05月 16日 20:25
 * @version: 1.0
 */
public class NumberNine {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0) return list;
        if (s.length() < p.length()) return list;
        int[] arrya = new int[26];
        int[] arryb = new int[26];
        for (int i = 0; i < p.length(); i++) {
            arrya[s.charAt(i) - 'a']++;
            arryb[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arrya, arryb)) {
            list.add(0);
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            arrya[s.charAt(i) - 'a']--;
            arrya[s.charAt(p.length() + i) - 'a']++;
            if (Arrays.equals(arrya, arryb)) {
                list.add(i+1);
            }
        }
        return list;
    }

    public List<Integer> findAnagrams1(String s, String p) {
        List<Integer> lsit = new ArrayList<>();
        int[] arry = new int[26];
        for (int i = 0; i < p.length(); i++) {
            arry[p.charAt(i)-'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            arry[s.charAt(right)-'a']--;
            while (arry[s.charAt(right)-'a']<0){
                arry[s.charAt(left)-'a']++;
                left++;
            }
            if (right-left+1==p.length()){
                lsit.add(left);
            }
        }
        return lsit;
    }
}
