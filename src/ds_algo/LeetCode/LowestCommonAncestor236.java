package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

/**
 * @Author: zy
 * @Date: 2021/1/16 18:07
 * @Description: [LeetCode] 236. Lowest Common Ancestor of a Binary Tree
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class LowestCommonAncestor236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return root;
    }
}
