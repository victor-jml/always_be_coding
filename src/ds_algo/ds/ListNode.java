package ds_algo.ds;

/**
 * @Author: zy
 * @Date: 2021/1/9 11:14
 * @Description:
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    /**
     * 使用arr为参数，创建一个链表，当前的ListNode为链表头节点
     * @param arr
     */
    public ListNode(int[] arr){
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = arr[0];
        ListNode cur = this;
        for(int i = 1; i < arr.length; i ++){
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }


    /**
     * 以当前节点为头节点的链表信息字符串 方便查看
     * @return
     */
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while(cur != null){
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
