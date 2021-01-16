package ds_algo.AcWing.wintervacation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/16 18:20
 * @Description: [AcWing] 104. WarehouseLocation
 * https://www.acwing.com/problem/content/106/
 */
public class WarehouseLocation104 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        WarehouseLocation104 demo = new WarehouseLocation104();
        System.out.println(demo.solution(arr));
    }

    public int solution(int[] arr){
        int res = 0;
        for(int i = 0 ; i < arr.length ; i++){
            // calculate the arr[i] - median
            res += Math.abs(arr[i] - arr[arr.length / 2]);
        }
        return res;
    }
}
