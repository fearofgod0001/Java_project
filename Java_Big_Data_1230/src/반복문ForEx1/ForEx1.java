package 반복문ForEx1;
// for 반복문 : for(초기식 ; 조건식;증감식){반복 수행 구간}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("정수를 입력하세요 : ");
        int number = Integer.parseInt(br.readLine());
        int sum = 0;
        int result =recursiveFunction(number);
        System.out.println(result);
    }

        public static int recursiveFunction (int n){
            if (n ==1) return 1;
            return n + recursiveFunction(n -1);
        }


//        for(int i = 1; i <=number; i++){
//            sum += i;
//        }
//        System.out.println("정수의 합은 : " + sum);
//


//        while(number > 0){
//            sum += number;
//            number --;
//
//        }
//        System.out.println("정수의 합은 : " + sum);


//        for (int i = 1; i <= 100; i++) {
//                System.out.printf("%4d",i);
//                if(i%10==0)System.out.println();
//        }

//        ===========================

//        int i = 1;
//        while(true){
//            System.out.printf("%4d",i);
//
//            if(i%10==0){
//                System.out.println();
//            }
//            i++;
//            if( i == 100 ) break;
//        }


    }

