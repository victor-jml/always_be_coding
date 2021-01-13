package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

/**
 * @Author: zy
 * @Date: 2021/1/13 23:23
 * @Description: [LeetCode] 101. Symmetric Tree
 * https://leetcode-cn.com/problems/symmetric-tree/
 */
public class IsSymmetric101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return DFS(root.left,root.right);
    }

    public boolean DFS(TreeNode left,TreeNode right){
        if(left == null || right == null){
            return left == null && right == null;
        }
        return left.val == right.val && DFS(left.left,right.right) && DFS(left.right,right.left);
    }
}
