package com.github.EpochFeng.leetcode100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName NumberThirty
 * @description: TODO
 * @datetime 2026年 06月 01日 14:31
 * @version: 1.0
 */
public class NumberThirty {
    private List<Integer> list = new ArrayList();

    public List<Integer> inorderTraversal(TreeNode root) {
        reserve(root);
        return list;
    }
    public void reserve(TreeNode root){
        if (root==null){
            return;
        }
        inorderTraversal( root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
}
