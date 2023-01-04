package 나머지연산자활용하기;
//100의 자리 정수를 입력 받아서 3개의 변수에 대입하기.

import java.util.Scanner;

public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        String num2 = sc.nextLine();
        int a, b, c;
        a = num / 100;
        b = num % 100 / 10;
        c = num % 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
