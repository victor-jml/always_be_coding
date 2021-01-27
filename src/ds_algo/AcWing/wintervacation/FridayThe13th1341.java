package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/27 21:02
 * @Description: [AcWing] 1341.FridayThe13th
 * https://www.acwing.com/problem/content/1343/
 */
public class FridayThe13th1341 {
    private static int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] weeks = new int[7];
        int n = sc.nextInt();
        int days = 1;
        for(int i = 1900; i < 1900 + n ; i++){
            for(int j = 1; j < 13; j++ ){
                weeks[(days + 12) % 7]++;
                days = days + month[j];
                if(j == 2){
                    if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                        days ++;
                    }
                }
            }
        }
        for(int i = 6 , j = 0 ; j < 7 ; j++){
            System.out.print(weeks[i] + " ");
            i = (i + 1) % 7;
        }
    }
}
