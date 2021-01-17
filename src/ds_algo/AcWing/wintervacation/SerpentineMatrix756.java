package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/17 20:12
 * @Description: [AcWing] 756. SerpentineMatrix
 * https://www.acwing.com/problem/content/758/
 */
public class SerpentineMatrix756 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        init(arr,n,m);
        print(arr,n,m);
    }

    private static void init(int[][] arr,int n,int m){
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int x = 0,y = 0,d = 1;
        for(int i = 1 ; i <= n * m ; i++){
            arr[x][y] = i;
            int a = dx[d] + x;
            int b = dy[d] + y;
            if(a < 0 || a >= n || b < 0 || b >= m || arr[a][b] != 0){
                d = (d + 1) % 4;
                a = dx[d] + x;
                b = dy[d] + y;
            }
            x = a;
            y = b;
        }
    }

    private static void print(int[][] arr,int n,int m){
        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
