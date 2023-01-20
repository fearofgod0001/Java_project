package 홀수짝수나눠담기;

import java.util.*;

//7개의 정수를 입력 받음(배열 생성 필요)
//정수 입력
public class OddEvenSeparator {

    List<Integer>inputArr = new ArrayList<>();
    List<Integer>oddArr = new ArrayList<>();
    List<Integer>evenArr = new ArrayList<>();

    void setInputArr() {
        System.out.println("정수 7개를 입력하세요 : ");
        int value = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            value = sc.nextInt();
            if(value == 999) break;
            inputArr.add(value);
        }
    }

    void separatorArray() {

        for (int e : inputArr) {
            if (e % 2 == 0) evenArr.add(e);
            else oddArr.add(e);
            }
        }


    void printArray() {
        System.out.println("홀수 : ");
        for (int e : oddArr) System.out.print(e + " ");
        System.out.println();
        System.out.println("홀수 : ");
        for (int e : evenArr) System.out.print(e + " ");
    }

    }
