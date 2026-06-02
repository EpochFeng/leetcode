package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyTwo
 * @description: TODO
 * @datetime 2026年 06月 01日 15:13
 * @version: 1.0
 */
public class NumberThirtyTwo {
    public TreeNode invertTree(TreeNode root) {
            if (root==null){
                return null;
            }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
