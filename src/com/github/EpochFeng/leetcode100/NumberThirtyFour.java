package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyFour
 * @description: TODO
 * @datetime 2026年 06月 02日 9:51
 * @version: 1.0
 */
public class NumberThirtyFour {
    private int ans;
    private int leftHeight;
    private int rightHeight;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        leftHeight = maxDepth(root.left);
        rightHeight = maxDepth(root.right);
        ans = Math.max(ans, leftHeight + rightHeight );
        return ans;
    }

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
