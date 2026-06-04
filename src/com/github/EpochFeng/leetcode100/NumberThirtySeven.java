package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirtySeven
 * @description: TODO
 * @datetime 2026年 06月 04日 10:27
 * @version: 1.0
 */
public class NumberThirtySeven {
    public boolean isValidBST(TreeNode root) {
       return isValidBST1(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST1(TreeNode root,long min,long max) {
        if (root==null) return true;
        int val = root.val;
        return val>min&&val<max&&isValidBST1(root.left,min,val)&&isValidBST1(root.right,val,max);
    }
}
