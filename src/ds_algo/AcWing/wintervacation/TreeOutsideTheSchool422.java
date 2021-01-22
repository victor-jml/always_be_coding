package ds_algo.AcWing.wintervacation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: zy
 * @Date: 2021/1/22 19:40
 * @Description: [AcWing] 422.TreeOutsideTheSchool
 * https://www.acwing.com/problem/content/424/
 */
public class TreeOutsideTheSchool422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        while(m-- > 0){
            int left = sc.nextInt();
            int right = sc.nextInt();
            list.add(new int[]{left,right});
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> merge = new ArrayList<>();
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < list.size();i++){
            if(list.get(i)[0] > max){
                if(min != Integer.MIN_VALUE) {
                    merge.add(new int[]{min,max});
                }
                min = list.get(i)[0];
                max = list.get(i)[1];
            }else{
                max = Math.max(max,list.get(i)[1]);
            }
        }
        merge.add(new int[]{min,max});


        for(int i = 0 ; i < merge.size(); i++){
            l -= merge.get(i)[1] - merge.get(i)[0] + 1;
        }
        System.out.println(l + 1);
    }
}
