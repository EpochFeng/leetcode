package com.github.EpochFeng.leetcode100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯纪元
 * @ClassName NumberFortyTwo
 * @description: TODO
 * @datetime 2026年 06月 09日 9:02
 * @version: 1.0
 */
public class NumberFortyTwo {
    private Map<Integer, Integer> map = new HashMap<>();
    private int ans;
    private int sum;

    public int pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return ans;
    }

    public void dfs(TreeNode root, int targetSum) {
        if (root == null) return;
        sum += root.val;
        if (map.containsKey(sum - targetSum)) {
            ans += map.get(sum - targetSum);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);

        map.put(sum, map.getOrDefault(sum, 0)- 1);
        sum-=root.val;
    }
}
