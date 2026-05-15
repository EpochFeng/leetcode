package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;
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
        String s = "pp";
        int i = lengthOfLongestSubstring(s);
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
}
