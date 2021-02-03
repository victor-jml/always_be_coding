package ds_algo.AcWing.wintervacation;

import java.util.ArrayList;
import java.util.Comparator;
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
        private static int[][] arr ;
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1][n + 1];
        dfs(1);
        res.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                for(int i = 0 ; i < o1.size() ; i++){
                    if(!o1.get(i).equals(o2.get(i))){
                        return o1.get(i) - o2.get(i);
                    }
                }
                return o1.get(0) - o2.get(0);
            }
        });
        if(res.size() <= 3){
            for(int i = 0 ; i < res.size(); i++){
                List<Integer> temp = res.get(i);
                for(int j = 0 ; i < temp.size() ; j++){
                    System.out.print(temp.get(j) + " ");
                }
                System.out.println();
            }
        }else{
            for(int i = 0 ; i < 3 ; i++){
                List<Integer> temp = res.get(i);
                for (Integer integer : temp) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
        }
        System.out.println(res.size());
    }


    private static void dfs(int index){
        if(index == arr.length){
            List<Integer> path = new ArrayList<>();
            for(int i = 1 ; i < arr.length ; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 1 ; j < arr.length ; j++){
                    if(arr[i][j] == 1){
                        sb.append(j);
                    }
                }
                path.add(Integer.parseInt(sb.toString()));
            }
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 1 ; i < arr.length ; i++){
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
        // check row
        for(int i = y1; i >= 1 ;i--){
            if(arr[x1][i] == 1){
                return false;
            }
        }
        while(x1 >= 1 && y1 >= 1){
            if(arr[--x1][--y1] == 1){
                return false;
            }
        }
        x1 = x;
        y1 = y;
        while(x1 < arr.length && y1 >= 1){
            if(arr[x1++][y1--] == 1){
                return false;
            }
        }
        return true;
    }
}
