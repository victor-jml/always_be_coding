package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

import java.util.Arrays;

/**
 * @Author: zy
 * @Date: 2021/1/14 19:32
 * @Description: [LeetCode] 105. Construct Binary Tree from Preorder and Inorder Traversal
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class BuildTree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if( preorder.length == 0){
            return null;
        }
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        if(preorder.length == 1){
            return root;
        }
        int inIndex = 0;
        for(int i = 0 ; i < inorder.length ; i++){
            if(inorder[i] == rootVal){
                inIndex = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder,1,1 + inIndex),Arrays.copyOfRange(inorder,0,inIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder,1 + inIndex,preorder.length),Arrays.copyOfRange(inorder,inIndex + 1,preorder.length));
        return root;
    }
}
