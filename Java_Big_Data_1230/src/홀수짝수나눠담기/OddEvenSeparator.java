package 홀수짝수나눠담기;

import java.util.*;

//7개의 정수를 입력 받음(배열 생성 필요)
//정수 입력
public class OddEvenSeparator {

    int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int e = 0;
    int o = 0;

    void setInputArr() {
        System.out.println("정수 7개를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
    }

    void separatorArray() {

        for (int i : inputArr) {
            if (i % 2 == 0) {
                evenArr[e] = i;
                e++;
            } else {
                oddArr[o] = i;
                o++;
            }
        }
    }

    void printArray() {
        System.out.println("홀수와 짝수를 찾습니다 odd(홀수) / even(짝수)");
        Scanner sc = new Scanner(System.in);
        String find = sc.next();
        if (find.equalsIgnoreCase("odd")) {
            for (int i = 0; i < o; i++) {
                System.out.print(oddArr[i] +" ");
                         }
            System.out.println();
        }else{
                for (int i = 0; i < e; i++) {
                    System.out.print(evenArr[i] + " ");
                }System.out.println();
            }
        }
    }
