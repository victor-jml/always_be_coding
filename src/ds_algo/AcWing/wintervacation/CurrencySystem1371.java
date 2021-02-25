package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/2/8 09:59
 * @Description: [AcWing] 1371.CurrencySystem
 * https://www.acwing.com/problem/content/1373/
 */
public class CurrencySystem1371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        long[] arr = new long[v];
        long[][] dp = new long[v + 1][n + 1];
        for(int i = 0 ; i <= v; i++){
            arr[i] = sc.nextInt();
        }
        dp[0][0] = 1;
        for(int i = 1 ; i <= v ; i++ ){
            for(int j = 0 ; j <= n ; j++){
                for(int k = 0 ; k * arr[i] <= j ; k++){
                    dp[i][j] += dp[i - 1][(int) (j - k * arr[i])];
                }
            }
        }
        System.out.println(dp[v][n]);
    }
}
