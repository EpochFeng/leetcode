package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyThree
 * @description: TODO
 * @datetime 2026年 06月 02日 9:20
 * @version: 1.0
 */
public class NumberThirtyThree {
    public boolean isSymmetric(TreeNode root) {
        return      isTrue(root.left,root.right);
    }
    public boolean isTrue(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left!=null&&right!=null){
            boolean aTrue = isTrue(left.right, right.left);
            boolean aTrue1 = isTrue(left.left, right.right);
            return aTrue1&&aTrue&&left.val==right.val;
        }
        return false;
    }
}
