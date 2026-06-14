package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @author 冯纪元
 * @ClassName NumberFifty
 * @description: TODO
 * @datetime 2026年 06月 14日 15:12
 * @version: 1.0
 */
public class NumberFifty {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isLeft(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isLeft(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPair(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        }
        if (left == '{' && right == '}') {
            return true;
        }
        if (left == '[' && right == ']') {
            return true;
        }
        return false;
    }
}
