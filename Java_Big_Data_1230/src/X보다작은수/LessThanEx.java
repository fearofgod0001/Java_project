package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제 : 정수 N개로 이루어진 배열 A와 정수X가 주어진다. 이 때 A에서 X보다 작은 수를 모두 출력
public class LessThanEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for(int i = 0;i < n; i++){ //리스트 입력
            list.add(sc.nextInt());
            if(list.get(i) <x )System.out.println(list.get(i)+ " ");
        }


    }
}
