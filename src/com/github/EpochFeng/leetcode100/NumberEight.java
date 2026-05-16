package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @author 冯纪元
 * @ClassName NumberEight
 * @description: TODO
 * @datetime 2026年 05月 15日 15:09
 * @version: 1.0
 */
public class NumberEight {
    public static void main(String[] args) {
        String s = "abba";
        int i = lengthOfLongestSubstring1(s);
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Queue<Character> queue = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (queue.contains(c)) {
                while (queue.peek() != c) {
                    queue.poll();
                }
                queue.poll();
            }
            queue.add(c);

            max = Math.max(queue.size(), max);
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }else {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
                map.put(s.charAt(i), i);
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}
