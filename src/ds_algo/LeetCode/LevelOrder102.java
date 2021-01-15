package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: zy
 * @Date: 2021/1/15 22:54
 * @Description: [LeetCode] 102. Binary Tree Level Order Traversal
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class LevelOrder102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> path = new ArrayList<>();
            int size = queue.size();
            for(int i = 0 ; i < size; i++){
                TreeNode node = queue.poll();
                path.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer((node.right));
                }
            }
            res.add(path);
        }
        return res;
    }
}
