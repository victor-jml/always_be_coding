package ds_algo.AcWing.wintervacation;

import java.util.*;

/**
 * @Author: zy
 * @Date: 2021/1/24 11:43
 * @Description: [AcWing] 429.ScholarShip
 * https://www.acwing.com/problem/content/431/
 */
public class ScholarShip429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new Person(i,a,b,c));
        }
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.sum == o2.sum){
                    if(o1.a == o2.a){
                        return o1.id - o2.id;
                    }else{
                        return o2.a - o1.a;
                    }
                }else{
                    return o2.sum - o1.sum;
                }
            }
        });
        for(int i = 0 ; i < 5; i++){
            Person person = list.get(i);
            System.out.println(person.id + " " + person.sum);
        }
    }
}

class Person{
    int id;
    int a;
    int b;
    int c;
    int sum;
    public Person(int id,int a,int b,int c){
        this.id  = id;
        this.a = a;
        this.b = b;
        this.c = c;
        this.sum = a + b + c;
    }
}