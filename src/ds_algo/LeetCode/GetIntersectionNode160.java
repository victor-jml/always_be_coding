package ds_algo.LeetCode;

import ds_algo.ds.ListNode;

/**
 * @Author: zy
 * @Date: 2021/1/10 00:23
 * @Description: [LeetCode] 160. Intersection of Two Linked Lists
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class GetIntersectionNode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        // headA,headB will meet when take the same number steps
        // e.g. headA (head to same node) -- x steps
        // headB (head to same node ) -- y steps
        // common area -- z steps
        // a(headA) will take x + z + (y) -- run again(a = headB)!!
        // b(headB) will take y + z + (x) -- run again(b = headA)!!
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            if(a != null){
                a = a.next;
            }else{
                a = headB;
            }
            if(b != null){
                b = b.next;
            }else{
                b = headA;
            }
        }
        return a;
    }
}
