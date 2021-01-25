package ds_algo.AcWing.wintervacation;

import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/25 21:08
 * @Description: [AcWing} 1208.FlipCoin
 * https://www.acwing.com/problem/content/1210/
 */
public class FlipCoin1208 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        String target = sc.nextLine();
        System.out.println(solution(start,target));
    }

    private static int solution(String start,String target){
        int res = 0;
        char[] arr = start.toCharArray();
        for(int i = 0 ; i < arr.length - 1; i++){
            char s = arr[i];
            if( s != target.charAt(i)){
                char next = parse(arr[i + 1]);
                arr[i] = parse(start.charAt(i));
                arr[i + 1] = next;
                res++;
            }
        }
        return res;
    }
    private static char parse(char s){
        if(s == '*'){
            return 'o';
        }else{
            return '*';
        }
    }
}
