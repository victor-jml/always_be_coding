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
    List<int[]> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        dfs(arr,0);
    }

    private static void dfs(int[][] arr ,int index){
        
    }

}
