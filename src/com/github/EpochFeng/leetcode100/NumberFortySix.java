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
        int start = 0;
        int end = matrix.length-1;
        while (start<end){
            int middle = (start +end+1)/ 2;
            if (matrix[middle][0]==target){
               return true;
            }else if (matrix[middle][0]<target){
                start = middle;
            }else {
                end = middle-1;
            }
        }
        if(start<0)return false;
        int left = 0;
        int right= matrix[start].length-1;
        while (left<=right){
            int middle = (left+ right)/2;
            if (matrix[start][middle]==target){
                return true;
            }else if (matrix[start][middle]<target){
                left = middle+1;
            }else {
                right = middle-1;
            }
        }
        return false;
    }
}
