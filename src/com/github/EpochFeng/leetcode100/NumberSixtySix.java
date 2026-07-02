package com.github.EpochFeng.leetcode100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName NumberSixtySix
 * @description: TODO
 * @datetime 2026年 07月 02日 11:07 AM
 * @version: 1.0
 */
public class NumberSixtySix {
    public int coinChange(int[] coins, int amount) {
        int[][] arry = new int[coins.length+1][amount+1];
        for (int i = 0; i < arry.length; i++) {
            Arrays.fill(arry[i],1000000);
        }
        arry[0][0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int coin = coins[j];
                arry[j+1][i] = arry[j][i];
                for (int z = coin; z <= i; z+=coin) {
                        arry[j+1][i] = Math.min(arry[j][i],arry[j+1][i-coin]+1);
                }
            }
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.println(Arrays.toString(arry[i]));
        }
        return arry[coins.length][amount]>=1000000?-1:arry[coins.length][amount];
    }
    public int coinChange1(int[] coins, int amount) {
        int[] arry = new int[amount+1];
        arry[0] = 0;
        for (int i = 1; i < arry.length; i++) {
            arry[i] = 10000000;
            for (int coin : coins) {
                if (coin<=amount&&i-coin>=0){
                    arry[i] = Math.min(arry[i],arry[i-coin]+1);
                    coin+=coin;
                }
            }
        }
        return arry[amount]>=10000000?-1:arry[amount];
    }
}
