package 소수판별하기;

import java.util.Scanner;

// 소수란 : 1과 자기 자신이외에는 나누어지지 않는 수
// 소수 판별하기 :
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수 여부 : "+ rst);


    }
    static boolean isPrime(int n){

        for(int i = 2; i< n; i++){
            if(n % i == 0 )return false;

        }
        return true;

    }
}
