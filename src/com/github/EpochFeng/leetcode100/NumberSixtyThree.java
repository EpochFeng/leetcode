package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberSixtyThree
 * @description: TODO
 * @datetime 2026年 06月 28日 16:32
 * @version: 1.0
 */
public class NumberSixtyThree {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            for (int i1 = 1; i1 < i; i1++) {
              list2.add(list.get(i-1).get(i1-1)+list.get(i-1).get(i1));
            }
            list2.add(1);
            list.add(list2);
        }
        return list;
    }
}
