package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyNine
 * @description: TODO
 * @datetime 2026年 06月 06日 21:34
 * @version: 1.0
 */
public class NumberThirtyNine {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root==null) return list;
                Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        list.add(root.val);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null)queue.add(poll.left);
                if (poll.right!=null)queue.add(poll.right);
                if (i==size-1)list.add(poll.val);
            }
        }
        return list;
    }
}
