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

    public int maxPathSum(TreeNode root) {
            max(root);
            return ans;
    }
    public int max(TreeNode root){
        if(root==null) return 0;
        int left = max(root.left);
        int right = max(root.right);
        ans=Math.max(ans,left+right+root.val);
        return Math.max(Math.max(left,right)+root.val,0);
    }
}
