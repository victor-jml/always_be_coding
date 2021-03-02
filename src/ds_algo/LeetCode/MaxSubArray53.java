package ds_algo.LeetCode;

/**
 * @Author: zy
 * @Date: 2021/3/2 22:42
 * @Description: [LeetCode] 53.MaxSubArray
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaxSubArray53 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for(int x : nums){
            pre = Math.max(x + pre , x);
            max = Math.max(max,pre);
        }
        return max;
    }
}
