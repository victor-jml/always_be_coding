package ds_algo.AcWing.wintervacation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/18 21:29
 * @Description: [AcWing] 1113. RedAndBlack
 * https://www.acwing.com/problem/content/1115/
 */
public class RedAndBlack1113 {

    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int cnt = 0;
            String[] ss = reader.readLine().split(" ");
            int row = Integer.parseInt(ss[1]);
            int col = Integer.parseInt(ss[0]);
            char[][] arr = new char[row][col];
            // 读到0 0 结束
            if (row == 0 || col == 0) break;
            int x = 0, y = 0;
            for (int i = 0; i < row; i++) {
                String s = reader.readLine();
                for (int j = 0; j < col; j++) {
                    arr[i][j] = s.charAt(j);
                    if (arr[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }

            int res = bfs(arr,x,y);
            System.out.println(res);
        }
    }

    private static int bfs(char[][] arr,int x,int y){
        int res = 0;
        arr[x][y] = '#';
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            res++;
            for(int i = 0 ; i < 4 ; i++){
                x = now[0] + dx[i];
                y = now[1] + dy[i];
                if(x >= 0 && x < arr.length && y >= 0 && y < arr[0].length && '.' == arr[x][y]){
                    arr[x][y] = '#';
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return res;
    }

}
