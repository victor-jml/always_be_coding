package ds_algo.LeetCode;

import ds_algo.ds.ListNode;

/**
 * @Author: zy
 * @Date: 2021/1/10 22:41
 * @Description: [LeetCode] 142. Linked List Cycle II
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class DetectCycle142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        // fast takes 2 steps
        // slow takes 1 step
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            if(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
            }else{
                return null;
            }
            if(slow.next != null){
                slow = slow.next;
            }else{
                return null;
            }
            if(fast == slow){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
