package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyEight
 * @description: TODO
 * @datetime 2026年 06月 27日 15:07
 * @version: 1.0
 */
public class NumberFiftyEight {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for (int price : prices) {
            if (price<min){
                min = price;
            }else {
                ans = Math.max(ans,price-min);
            }

        }
        return ans;
    }
}
