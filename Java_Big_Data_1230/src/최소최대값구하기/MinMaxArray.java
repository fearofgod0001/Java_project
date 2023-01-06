package 최소최대값구하기;
// 정수 값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기

import java.io.*;
import java.util.*;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수 값을 입력 하세요 : ");
        int a = sc.nextInt();
        int[] arr = new int[a];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        } System.out.println("최댓값 : " + max);

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }System.out.println("최솟값 : " + min);


//        for(int i : arr){
//            if(min > i)min =i;
//            if(max < i)max =i;
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            if(min > arr[i]) min = arr[i];
//            if(max < arr[i]) max = arr[i];
//        }
//        System.out.println("최솟값 : " + min);
//        System.out.println("최댓값 : " + max);
    }
}
