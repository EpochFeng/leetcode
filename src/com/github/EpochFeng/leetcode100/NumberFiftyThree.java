package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyThree
 * @description: TODO
 * @datetime 2026年 06月 25日 3:03 PM
 * @version: 1.0
 */
public class NumberFiftyThree {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] arry = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()||temperatures[stack.peek()]>=temperatures[i]){
                stack.push(i);
            }else {
                while (!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                        Integer pop = stack.pop();
                        arry[pop] = i-pop;
                }
                stack.push(i);
            }
        }

        return arry;
    }
}
