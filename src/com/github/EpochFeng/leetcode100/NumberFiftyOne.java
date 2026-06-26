package com.github.EpochFeng.leetcode100;

import java.util.Stack;

/**
 * @author 冯纪元
 * @ClassName NumberFiftyOne
 * @description: TODO
 * @datetime 2026年 06月 24日 9:39 AM
 * @version: 1.0
 */
public class NumberFiftyOne {
    static class MinStack {
        Stack<Long> stack;
        long min ;
        public MinStack() {
             stack = new Stack<>();
        }

        public void push(int value) {
            if (stack.isEmpty()){
                stack.push(0L);
                min =(long) value;
            }else {
                long l = value - min;
                stack.push(l);
                if (l<0) {
                    min =(long) value;
                }
            }
        }

        public void pop() {
            Long pop = stack.pop();
            if (pop<0)min = min-pop;

        }

        public int top() {
            Long pop = stack.peek();
            return pop<0?(int)min:(int)(min+pop);
        }

        public int getMin() {
            return (int)min;
        }
    }
}
