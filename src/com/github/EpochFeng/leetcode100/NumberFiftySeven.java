package com.github.EpochFeng.leetcode100;

import java.util.PriorityQueue;

/**
 * @author 冯纪元
 * @ClassName NumberFiftySeven
 * @description: TODO
 * @datetime 2026年 06月 27日 14:45
 * @version: 1.0
 */
public class NumberFiftySeven {
    class MedianFinder {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;
        public MedianFinder() {
        left = new PriorityQueue<>((a,b)->b-a);
        right = new PriorityQueue<>();
        }

        public void addNum(int num) {
            if (left.size()==right.size()){
                right.add(num);
                left.add(right.poll());
            }else {
                left.add(num);
                right.add(left.poll());
            }
        }

        public double findMedian() {
          return   left.size()==right.size()? (double) (left.peek() + right.peek()) /2:left.peek();
        }
    }
}
