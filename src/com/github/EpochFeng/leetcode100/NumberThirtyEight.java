package com.github.EpochFeng.leetcode100;

import java.util.ArrayDeque;

/**
 * @author 冯纪元
 * @ClassName NumberThirtyEight
 * @description: TODO
 * @datetime 2026年 06月 05日 21:44
 * @version: 1.0
 */
public class NumberThirtyEight {
    private int i ;
    private int temp;
    public int kthSmallest(TreeNode root, int k) {
        this.i = k;
        dfs(root);
        return temp;
    }

        public void  dfs(TreeNode root) {
            if (root==null) return;
            dfs(root.left);
            if (--i==0){
               temp = root.val;
            }
            dfs(root.right);
    }
    public int kthSmallest1(TreeNode root, int k) {
        if (root==null)return -1;
        ArrayDeque<TreeNode> queue = new ArrayDeque();
        while (root!=null||!queue.isEmpty()){
            while (root!=null){
                queue.push(root.left);
                root= root.left;
            }
            TreeNode poll = queue.poll();
            if (--k==0) return poll.val;
            root = poll.right;
        }
        return -1;
    }
}
