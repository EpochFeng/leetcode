package com.github.EpochFeng.leetcode100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName NumberSeventy
 * @description: TODO
 * @datetime 2026年 07月 04日 19:27
 * @version: 1.0
 */
public class NumberSeventy {
    public int longestValidParentheses(String s) {
        if (s==null||s.length()==0) return 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c==')'){
                char b = s.charAt(i-1);
                if(b=='('){
                    dp[i] = i>=2?dp[i-2]+2:2;
                }else {
                    int i1 = i - dp[i - 1]-1;
                    if (i1>=0&&s.charAt(i1)=='(') dp[i] = dp[i-1]+2+(i-dp[i-1]>=2?dp[i-dp[i-1]-2]:0);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
