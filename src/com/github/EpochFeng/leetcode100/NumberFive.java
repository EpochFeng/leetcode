package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFive
 * @description: TODO
 * @datetime 2026年 05月 12日 10:29
 * @version: 1.0
 */
public class NumberFive {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int i = maxArea(arr);
        System.out.println(i);
    }
    public static int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int area = 0;
       while (left<right){
           int temp = Math.min(height[left],height[right])*(right-left);
           area = Math.max(temp,area);
           if(height[left]<height[right]){
               left++;
           }else {
               right--;
           }
       }
       return area;
    }
}
