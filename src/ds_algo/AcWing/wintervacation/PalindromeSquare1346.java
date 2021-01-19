package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/19 12:23
 * @Description: [AcWing] 1346. PalindromeSquare
 * https://www.acwing.com/problem/content/1348/
 */
public class PalindromeSquare1346 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= 300; i++){
            String res =  base(i * i , n);
            if(check(res)){
                System.out.println(base(i,n) + " " + res);
            }
        }
    }

    private static String base(int x,int n){
        StringBuilder num = new StringBuilder();
        while(x != 0){
            num.append(parse(x % n));
            x /= n;
        }
        return num.reverse().toString();
    }

    private static char parse(int num){
        String code = "0123456789ABCDEFGHIJ";
        return code.charAt(num);
    }

    private static boolean check(String res){
        for(int i = 0 , j = res.length() - 1 ; i < j ; i++ , j--){
            if(res.charAt(i) != res.charAt(j) ){
                return false;
            }
        }
        return true;
    }
}
