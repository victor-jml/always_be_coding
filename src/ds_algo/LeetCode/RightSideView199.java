package ds_algo.LeetCode;

import ds_algo.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: zy
 * @Date: 2021/3/2 21:27
 * @Description: [LeetCode] 199.RightSideView
 * https://leetcode-cn.com/problems/binary-tree-right-side-view/
 */
public class RightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                if(i == size - 1){
                    res.add(node.val);
                }
            }
        }
        return res;
    }
}
