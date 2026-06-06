package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;

/**
 * @author 冯纪元
 * @ClassName NumberThirtySeven
 * @description: TODO
 * @datetime 2026年 06月 05日 20:51
 * @version: 1.0
 */
public class NumberThirtySeven {
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
     return    isValidBST1(root,min,max);
    }

    public boolean isValidBST1(TreeNode root,long min,long max) {
        if (root == null) return  true;
        int val = root.val;
        return val>min&&val<max&&isValidBST1(root.left,min,val)&&isValidBST1(root.right,val,max);
    }
    long pre = Long.MIN_VALUE;
    public boolean isValidBST2(TreeNode root) {
        if (root == null) return  true;
        if (!isValidBST2(root.left)){
            return false;
        }
        if (root.val<=pre){
            return false;
        }
        pre =root.val;
        return isValidBST2(root.right);
    }
    public boolean isValidBST3(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (root!=null||!queue.isEmpty()){
            while (root!=null){
                queue.push(root);
                root = root.left;
            }
            TreeNode pop = queue.pop();
            if (pop.val<=pre)return false;
            pre =pop.val;
            root = pop.right;
        }

        return true;
    }
}
