package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyFive
 * @description: TODO
 * @datetime 2026年 06月 02日 10:15
 * @version: 1.0
 */
public class NumberThirtyFive {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root==null) return list;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> collect = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                if (remove.left!=null){
                    queue.add(remove.left);
                }
                if (remove.right!=null){
                    queue.add(remove.right);
                }
                collect.add(remove.val);
            }
            list.add(collect);
        }
        return list;
    }
}
