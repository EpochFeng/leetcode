package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberFourteen
 * @description: TODO
 * @datetime 2026年 05月 20日 10:36
 * @version: 1.0
 */
public class NumberFourteen {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{4,7},{1,4}};
        int[][] merge = merge(ints);
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int left=intervals[0][0],right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int i1 = intervals[i][0];
            int i2 = intervals[i][1];
            if (i1>right){
                list.add(new int[]{left,right});
                left = i1;
                right = i2;
            }else {
                right = Math.max(i2,right);
            }
        }
        list.add(new int[]{left,right});
        return list.toArray(new int[list.size()][]);
    }

}
