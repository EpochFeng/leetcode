package com.github.EpochFeng.leetcode100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName NumberSixtyFive
 * @description: TODO
 * @datetime 2026年 06月 30日 21:02
 * @version: 1.0
 */
public class NumberSixtyFive {
    private static int[][] memo = new int[101][100001];
    static {
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
    }
    public int numSquares(int n) {
        return numSquares((int)Math.sqrt(n),n);

    }
    private static int numSquares(int i,int j) {
        if(i == 0){
            return j==0?0:Integer.MAX_VALUE;
        }
        if(memo[i][j] != -1){
            return memo[i][j];
        }
        if (j<i*i){
            return memo[i][j] = numSquares(i-1,j);
        }
       return memo[i][j] = Math.min(numSquares(i-1,j),numSquares(i,j-i*i)+1);
    }
}
