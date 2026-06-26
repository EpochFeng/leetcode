package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyTwo
 * @description: TODO
 * @datetime 2026年 06月 24日 10:56 AM
 * @version: 1.0
 */
public class NumberFiftyTwo {
    public String decodeString(String s) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder str = new StringBuilder();
        int multiple = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                multiple = (c - '0') + 10 * multiple;
            }else if ('['==c){
                integerStack.push(multiple);
                stringStack.push(str.toString());
                multiple = 0;
                str = new StringBuilder();
            }else if (']'==c){
                Integer pop = integerStack.pop();
                String pop1 = stringStack.pop();
                for (Integer integer = 0; integer < pop; integer++) {
                    pop1 = pop1+str;
                }
                str = new StringBuilder(pop1);
            }else {
                str.append(c);
            }
        }
        return str.toString();
    }
}
