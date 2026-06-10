package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortyThree
 * @description: TODO
 * @datetime 2026年 06月 09日 15:34
 * @version: 1.0
 */
public class NumberFortyThree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left==null&&right==null) return null;
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
