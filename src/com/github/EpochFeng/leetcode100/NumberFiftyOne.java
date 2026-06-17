package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @ClassName   NumberFiftyOne
 * @description: TODO
 * @author      冯纪元
 * @datetime    2026年 06月 17日 18:08
 * @version:    1.0
 */
public class NumberFiftyOne {
    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;
        public MinStack() {
            this.stack = new Stack<>();
           this. minStack = new Stack<>();
        }

        public void push(int value) {
            stack.push(value);
            if (minStack.isEmpty()){
                minStack.push(value);
            }else {
                Integer peek = minStack.peek();
                if (peek<=value){
                    minStack.push(peek);
                }else {
                    minStack.push(value);
                }
            }
        }

        public void pop() {
            if (!stack.isEmpty()){
             stack.pop();
             minStack.pop();}
        }

        public int top() {

            return stack.pop();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    class MinStack1 {
        Stack<Integer> stack;
        Integer min;
        public MinStack1() {
            this.stack = new Stack<>();
            this. min = Integer.MAX_VALUE;
        }

        public void push(int value) {
           if (stack.isEmpty()){
               this.min = value;
               stack.push(value-min);
           }else if (value<min){
               stack.push(value-min);
               this.min = value;
           }else {
               stack.push(value-min);
           }
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop<0){
                this.min -=pop;
            }
        }

        public int top() {
            return stack.peek()+this.min;
        }

        public int getMin() {
            return this.min;
        }
    }
}
