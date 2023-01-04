package 제일큰값찾기;

import java.util.Scanner;

// 세자리 정수를 입력받아서
public class MaxValue {
    public static void main(String[] args) {
        for(;;) {
            Scanner sc = new Scanner(System.in);
            System.out.print("세자리 정수를 입력하세요  : ");
            int number = sc.nextInt();
            int a, b, c;
            int big;

            a = number / 100;
            b = number % 100 / 10;
            c = number % 10;

            big = Math.max(a, b);
            big = Math.max(c, big);

            System.out.println(big);
        }


    }
}
