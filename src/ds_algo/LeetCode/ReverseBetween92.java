package ds_algo.LeetCode;

import ds_algo.ds.ListNode;

/**
 * @Author: zy
 * @Date: 2021/1/9 11:13
 * @Description: [LeetCode] 92. ReverseBetween
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class ReverseBetween92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return null;
        }
        // considering if m == 1 , n == List.len (Mean to reserve all ListNode)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // we need to find 4 Nodes
        // (pre(cur.pre) , cur(the first of reserve list) , last(the last of reserve list), tail(last.next))
        ListNode pre = dummy;
        ListNode cur = head;
        for(int i = 1 ; i < m ; i++){
            pre = pre.next;
            cur = cur.next;
        }
        ListNode last = cur;
        for(int i = m ; i < n ; i++){
            last = last.next;
        }
        ListNode tail = last.next;
        // post-reserve , we need to let pre.next = last, cur.next = tail
        pre.next = reserver(cur,n - m + 1);
        cur.next = tail;
        return dummy.next;
    }

    /**
     * reserve k nodes
     * @param node
     * @param k
     * @return
     */
    private ListNode reserver(ListNode node,int k){
        ListNode pre = null;
        for(int i = 0 ; i < k ; i++){
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
