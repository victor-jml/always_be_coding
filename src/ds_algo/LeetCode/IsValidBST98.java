package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

/**
 * @Author: zy
 * @Date: 2021/1/11 19:49
 * @Description: [LeetCode] 98. Validate Binary Search Tree
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class IsValidBST98 {
    public boolean isValidBST(TreeNode root) {
        return recursion(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean recursion(TreeNode root,Long left,Long right){
        if(root == null){
            return true;
        }
        // if root.val < left TreeNode.val | root.val > right TreeNode.val
        // not meet the condition of BST
        if(root.val < left || root.val > right){
            return false;
        }
        // recursion the root.left & root.right (update the left , right intervals)
        return recursion(root.left,left,root.val - 1L) && recursion(root.right,root.val + 1L ,right);
    }
}

