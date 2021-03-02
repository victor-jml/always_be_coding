package ds_algo.LeetCode;

/**
 * @Author: zy
 * @Date: 2021/3/2 21:34
 * @Description: [LeetCode] 215.FindKthLargest
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class FindKthLargest215 {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0){
            return 0;
        }
        return quickSort(nums,0,nums.length - 1,k);
    }

    private int quickSort(int[] arr,int start,int end,int k){
        int index = arr[start];
        int i = start;
        int j = end;
        while(i < j){
            while(i < j && arr[j] >= index){
                j--;
            }
            if(i < j){
                arr[i++] = arr[j];
            }
            while(i < j && arr[i] <= index){
                i++;
            }
            if(i < j){
                arr[j--] = arr[i];
            }
            arr[i] = index;
        }
        if(end - i + 1 == k){
            return arr[i];
        }else if(end - i + 1 > k){
            return quickSort(arr,i + 1,end,k);
        }else{
            return quickSort(arr,start,i - 1, k - end + i - 1);
        }
    }
}
