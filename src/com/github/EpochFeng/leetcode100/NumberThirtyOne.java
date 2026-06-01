package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyOne
 * @description: TODO
 * @datetime 2026年 06月 01日 14:47
 * @version: 1.0
 */
public class NumberThirtyOne {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int let = 0;
        if (root.left != null) {
            let = maxDepth(root.left);
        }
        int right = 0;
        if (root.right != null) {
            right = maxDepth(root.right);
        }
        return Math.max(let, right) + 1;
    }
}
