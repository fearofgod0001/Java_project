package 소수판별하기;

import java.util.Scanner;

// 소수란 : 1과 자기 자신이외에는 나누어지지 않는 수
// 소수 판별하기 :
// 소수의 합 구하기 : 정수 값을 입력 받아, 입력 받은 정수값 미만의 소수의 합을 구하는 문제
// 정수 입력 : 12
// 결과 : 2 + 3 + 5 + 7
// 문제를 푸는 방법 : 메소드를 호출시 정수 값을 입력해서 해당 점숭
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        int sum = 0; // 입력 받은 정수 미만의 소수의 합을 누적
        // 반복문 수행 : 입력 받은 정수 미만의 값으로 메소드 호출
        for(int i = 2 ; i < number; i++){
            sum += primeSum(i);

        }
        System.out.println(sum);

    }

    static int primeSum(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
            }
        if(isPrime) return n;
        else return 0;

        }
    }
