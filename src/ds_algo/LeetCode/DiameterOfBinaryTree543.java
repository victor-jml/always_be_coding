package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

/**
 * @Author: zy
 * @Date: 2021/1/16 18:11
 * @Description: [LeetCode] 543. Diameter of Binary Tree
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree543 {
    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root){
        // if root == null , it means reach to the bottom
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        // bottom up to update the res (left tree height + right tree height)
        res = Math.max(res,(left + right));
        // every level will increase the height
        return Math.max(left,right) + 1;
    }
}
