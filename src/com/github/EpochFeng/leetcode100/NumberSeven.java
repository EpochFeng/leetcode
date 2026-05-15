package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberSeven
 * @description: TODO
 * @datetime 2026年 05月 14日 15:24
 * @version: 1.0
 */
public class NumberSeven {
    public static void main(String[] args) {
        int[] arry = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trap = trap2(arry);
        System.out.println(trap);
    }

    public static int trap(int[] height) {
        int maxHeight = 0;
        for (int i : height) {
            if (i > maxHeight) {
                maxHeight = i;
            }
        }
        int ans = 0;
        for (int j = 1; j <= maxHeight; j++) {
            boolean isTrue = false;
            int temp = 0;
            for (int i = 0; i < height.length; i++) {
                if (isTrue && height[i] < j) {
                    temp += 1;
                }
                if (height[i] >= j) {
                    ans += temp;
                    isTrue = true;
                    temp = 0;
                }
            }
        }
        return ans;
    }

    public static int trap1(int[] height) {
        int ans = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int temp = height[i];
            int maxLeft = 0;
            for (int left = 0; left < i; left++) {
                if (height[left] > maxLeft) {
                    maxLeft = height[left];
                }
            }
            int maxRight = 0;
            for (int right = i + 1; right < height.length; right++) {
                if (height[right] > maxRight) {
                    maxRight = height[right];
                }
            }
            if (temp < maxLeft && temp < maxRight) {
                int min = Math.min(maxLeft, maxRight);
                ans += min - temp;
            }
        }
        return ans;
    }

    public static int trap2(int[] height) {
        int ans = 0;
        int[] leftHeight = new int[height.length];
        int[] rightHeight = new int[height.length];
        leftHeight[0]=height[0];
        rightHeight[height.length-1]=height[height.length-1];
        for (int i = 1; i < height.length; i++) {
            leftHeight[i]=Math.max(leftHeight[i-1],height[i]);
        }
        for (int i = height.length-2; i >= 0; i--) {
            rightHeight[i]=Math.max(rightHeight[i+1],height[i]);
        }
        for (int i = 1; i < height.length-1; i++) {
            int temp = height[i];
            if (temp<leftHeight[i]&&temp<rightHeight[i]){
                int min = Math.min(leftHeight[i], rightHeight[i]);
                ans+=min-temp;
            }
        }
        return ans;
    }
}
