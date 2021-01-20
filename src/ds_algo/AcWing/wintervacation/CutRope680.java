package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/20 19:05
 * @Description: [AcWing] 680.CutRope
 * https://www.acwing.com/problem/content/682/
 */
public class CutRope680 {
    private static int[] arr;
    private static int m;
    private static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[m];
        for(int i = 0 ; i < m ; i++){
            arr[i] = sc.nextInt();
        }
        solution();
    }

    private static void solution(){
        double l = 0 , r = 1e9;
        while(r - l > 1e-4){
            double mid = (l + r) / 2;
            if(check(mid)){
                l = mid + 0.001;
            }else{
                r = mid ;
            }
        }
        System.out.printf("%.2f",l);
    }

    private static boolean check(double len){
        int res = 0;
        for(int i = 0 ; i < m ; i++){
            res += arr[i] / len;
            if(res >= n){
                return true;
            }
        }
        return false;
    }
}
