package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/21 20:26
 * @Description: [AcWing] 1227.DivideChocolate
 * https://www.acwing.com/problem/content/1229/
 */
public class DivideChocolate1227 {
    private static int[] H;
    private static int[] W;
    private static int N;
    private static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        H = new int[N];
        W = new int[N];
        for(int i = 0 ; i < N; i++){
            H[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }
        int l = 1;
        int r = 100000;
        while(l < r){
            int mid = l + r + 1 >> 1;
            if(check(mid)){
                l = mid ;
            }else{
                r = mid - 1;
            }
        }
        System.out.println(l);
    }

    private static boolean check(int mid){
        int res = 0 ;
        for(int i = 0 ; i < N ;i++){
            res += H[i] / mid * (W[i] / mid);
        }
        if(res >= K) return true;
        return false;
    }
}
