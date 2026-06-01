package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName TreeNode
 * @description: TODO
 * @datetime 2026年 06月 01日 14:31
 * @version: 1.0
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int height = 0;



    public TreeNode() {
    }

    public  TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    int getHeight(){
        return Math.max(this.left.getHeight(),this.right.getHeight())+1;
    }
}
