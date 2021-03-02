package ds_algo.LeetCode;

/**
 * @Author: zy
 * @Date: 2021/3/2 22:43
 * @Description: [LeetCode] 415.AddString
 * https://leetcode-cn.com/submissions/detail/116361858/
 */
public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        StringBuilder res = new StringBuilder();
        int target = 0;
        while(l1 >= 0 || l2 >= 0){
            target += l1 >= 0 ? num1.charAt(l1--) - '0' : 0;
            target += l2 >= 0 ? num2.charAt(l2--) - '0' : 0;
            res.append(target % 10);
            target = target / 10;
        }
        if(target == 1){
            res.append(1);
        }
        return res.reverse().toString();
    }
}
