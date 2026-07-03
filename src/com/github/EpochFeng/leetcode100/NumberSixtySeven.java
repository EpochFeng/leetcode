package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberSixtySeven
 * @description: TODO
 * @datetime 2026年 07月 03日 10:07 AM
 * @version: 1.0
 */
public class NumberSixtySeven {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }

        }
        return dp[s.length()];
    }
}
