package Arrays클래스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/*
* Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있습니다.
* binarySearch() : 이분 검색 알고리즘 제공
* sort() : 기본적인 오름차순, 그리고 매개변수를 이용해 내림차순 , 그리고 오버라이딩 통한 직접 구현
* toString() : 배열의 요소를 문자열로 출력
* asList() : 일반 배열을 ArrayList 로 변환
* 배열의 개수 입력, 찾을 수 입력
* */
public class ArraysTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 개수 : ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * num ) + 1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int rst = Arrays.binarySearch(arr, key);
        //System.out.println(rst);

        if(rst >=0) System.out.println(rst);
        else System.out.println("찾는 값이 없습니다.");
    }
}
