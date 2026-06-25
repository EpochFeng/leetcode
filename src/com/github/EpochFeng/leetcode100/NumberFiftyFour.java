package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyFour
 * @description: TODO
 * @datetime 2026年 06月 25日 4:15 PM
 * @version: 1.0
 */
public class NumberFiftyFour {
    public int largestRectangleArea(int[] heights) {
        int max = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i <= heights.length; i++) {
            int i1 = i < heights.length ? heights[i] : -1;
            while (stack.size()>1&&heights[stack.peek()]>=i1){
                Integer pop = stack.pop();
                Integer peek = stack.peek();
                max=Math.max((i-peek-1)*heights[pop],max);
            }
            stack.push(i);
        }
        return max;
    }
}
