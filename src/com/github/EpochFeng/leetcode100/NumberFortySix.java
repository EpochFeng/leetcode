package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortySix
 * @description: TODO
 * @datetime 2026年 06月 11日 16:27
 * @version: 1.0
 */
public class NumberFortySix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int temp = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == target) return true;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == target) return true;
            if (matrix[i][0] > target) {
                temp = i - 1;
                break;
            }
        }
        for (int i = 0; i < matrix[matrix.length - 1].length; i++) {
            if (matrix[matrix.length - 1][i] == target) return true;
        }
        if (temp == -1) return false;
        for (int i = 0; i < matrix[temp].length; i++) {
            if (matrix[temp][i] == target) {
                return true;
            }
        }
        return false;
    }
}
