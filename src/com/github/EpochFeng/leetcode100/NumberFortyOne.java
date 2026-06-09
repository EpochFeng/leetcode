package com.github.EpochFeng.leetcode100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯纪元
 * @ClassName NumberFortyOne
 * @description: TODO
 * @datetime 2026年 06月 08日 15:55
 * @version: 1.0
 */
public class NumberFortyOne {
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            this.map.put(inorder[i],i);
        }
      return   recursion(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode recursion(int[] preorder, int pleft, int pright, int[] inorder, int ileft, int iright) {
        if (pleft>pright||ileft>iright){
            return null;
        }
        int pRootValue = preorder[pleft];
        Integer iRootIndex = map.get(pRootValue);
        int pRightRootIndex = pleft + (iRootIndex - ileft);
        TreeNode treeNode = new TreeNode(pRootValue);
        treeNode.left = recursion(preorder,pleft+1,pRightRootIndex,inorder,ileft,iRootIndex-1);
        treeNode.right= recursion(preorder,pRightRootIndex+1,pright,inorder,iRootIndex+1,pright);
        return treeNode;
    }
}
