package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/28 20:57
 * @Description:
 */
public class SquareMatrix754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[][] arr = new int[n][n];
            int len = n;
            while(n > 0){
                for(int i = 0 ; i < n ; i++){
                    for(int j = i , k = 1; j < n ; j++,k++){
                        arr[i][j] = k;
                        arr[j][i] = k;
                    }
                }
                n--;
            }
            for(int i = 0 ; i < len ; i++){
                for(int j = 0 ; j < len ; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        }
    }
}
