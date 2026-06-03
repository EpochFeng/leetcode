package com.github.EpochFeng.leetcode100;

/**
 * @author 冯纪元
 * @ClassName NumberThirtySix
 * @description: TODO
 * @datetime 2026年 06月 03日 17:16
 * @version: 1.0
 */
public class NumberThirtySix {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }
    public TreeNode sort(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode treeNode = new TreeNode(nums[middle]);
        treeNode.left = sort(nums,left,middle-1);
        treeNode.right = sort(nums,middle+1,right);
        return treeNode;
    }
}
