package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberForty
 * @description: TODO
 * @datetime 2026年 06月 07日 14:30
 * @version: 1.0
 */
public class NumberForty {
    TreeNode pre = null;

    public void flatten(TreeNode root) {
        while (root != null) {
            TreeNode temp = root.left;
            if (temp != null) {
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = root.right;
                root.right = root.left;
                root.left = null;
            }else {
                temp = root.right;
            }
            root = root.right;
        }
    }
    public void flatten1(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.left = null;
        root.right = pre;
        pre =root;
    }
}
