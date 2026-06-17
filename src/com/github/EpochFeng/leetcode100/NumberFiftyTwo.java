package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyTwo
 * @description: TODO
 * @datetime 2026年 06月 17日 19:32
 * @version: 1.0
 */
public class NumberFiftyTwo {
    public String decodeString(String s) {
        int k = 0;
        String currentStr = "";
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                integerStack.push(k);
                stringStack.push(currentStr);
                currentStr = "";
                k = 0;
            } else if (c == ']') {
                Integer pop = integerStack.pop();
                String str = "";
                for (Integer integer = 0; integer < pop; integer++) {
                    str += currentStr;
                }
                currentStr = stringStack.pop() + str;
            } else {
                currentStr += c;
            }
        }
        return currentStr;
    }
}
