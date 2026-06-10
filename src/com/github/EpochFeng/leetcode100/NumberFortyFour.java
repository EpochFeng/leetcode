package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberFortyFour
 * @description: TODO
 * @datetime 2026年 06月 10日 16:54
 * @version: 1.0
 */
public class NumberFortyFour {
    int ans = -1000000;
    int max = -1000000;

    public int maxPathSum(TreeNode root) {
        maxPathSum1(root);
        return ans;
    }

    public int maxPathSum1(TreeNode root) {
        if (root == null) return -1000000;
        int left = maxPathSum1(root.left);
        int right = maxPathSum1(root.right);
        int max2 = Math.max(left + root.val, right + root.val);
        max = Math.max(max2, root.val);
        if (root.val <= 0) {
            int max1 = Math.max(left, right);
            int ans1 = Math.max(max1, left + right + root.val);
            int max3 = Math.max(ans1, root.val);
            ans = Math.max(max3, ans);
        } else {
            int ans1 = Math.max(max, left + right + root.val);
            ans = Math.max(ans1, ans);
        }
        return max;
    }
}
