package ds_algo.AcWing.wintervacation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/30 23:39
 * @Description: [AcWing] 1432.BoardChallenge
 * https://www.acwing.com/problem/content/1434/
 */
public class BoardChallenge1432 {
    private static List<List<Integer>> res = new ArrayList<>();
    private static List<Integer> path = new ArrayList<>();
    private static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        dfs(0);
        for(int i = 0 ; i < 3 ; i++){
            List<Integer> list = res.get(i);
            for(int x : list){
                System.out.print(x + " ");
            }
        }
    }

    /**
     *
     * @param index row
     */
    private static void dfs(int index){
        if(index == arr.length ){
            List<Integer> path = new ArrayList<>();
            for(int i = 0 ; i < arr.length ; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < arr.length ;j++){
                    if(arr[j][i] == 1){
                        sb.append()
                    }
                }
            }
        }
        // loop col
        for(int i = 0 ; i < arr.length ; i++){
            if(check(i,index)){
                arr[i][index] = 1;
                dfs(index + 1);
                arr[i][index] = 0;
            }
        }
    }

    private static boolean check(int x,int y){
        int x1 = x;
        int y1 = y;
        int n = arr.length;
        for(int i = x1 ; i >= 0; i--){
            if(arr[i][y1] == 1){
                return false;
            }
        }
        x1 = x;
        y1 = y;
        while(x1 >= 0 && y1 >= 0){
            if(arr[--x1][--y1] == 0){
                return false;
            }
        }
        x1 = x;
        y1 = y;
        while (x1 < n && y1 < n){
            if(arr[++x1][--y1] == 1){
                return false;
            }
        }
        return true;
    }
}
