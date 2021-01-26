package ds_algo.AcWing.wintervacation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/26 19:42
 * @Description: [AcWing] 1532.FindCoin
 * https://www.acwing.com/problem/content/1534/
 */
public class FindCoin1532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[2];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int end = arr.length - 1 ;
        for(int i = 0 , j = end ; i < j ; i++){
            while(i < j && arr[i] + arr[j] > m){
                j--;
            }
            if(i < j && arr[i] + arr[j] == m){
                res[0] = arr[i];
                res[1] = arr[j];
                break;
            }
        }
        if(res[0] != 0){
            System.out.println(res[0] + " " + res[1]);
        }else {
            System.out.println("No Solution");
        }
    }
}
