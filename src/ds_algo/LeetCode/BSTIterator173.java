package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

import java.util.Stack;

/**
 * @Author: zy
 * @Date: 2021/1/17 10:41
 * @Description: [LeetCode] 173. Binary Search Tree Iterator
 * https://leetcode-cn.com/problems/binary-search-tree-iterator/
 */
public class BSTIterator173 {

    private Stack<TreeNode> stack;
    private TreeNode root;

    public BSTIterator173(TreeNode root) {
        stack = new Stack<>();
        this.root = root;
        init(root);
    }

    private void init(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        root = stack.pop();
        int res = root.val;
        init(root.right);
        return res;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

//
//    public static void main(String[] args) {
//        Integer[] arr = {7, 3, 15};
//        TreeNode root = TreeNode.getTreeNode(arr);
//        BSTIterator173 bstIterator173 = new BSTIterator173(root);
//        System.out.println(bstIterator173.next());
//        System.out.println(bstIterator173.next());
//        System.out.println(bstIterator173.hasNext());
//    }
}
