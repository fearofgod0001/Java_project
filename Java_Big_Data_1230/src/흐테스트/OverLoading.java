package 흐테스트;

import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); //입력받은 수
        int tmp = i; //대입 되는 수
        int cnt = 0; // 카운트

        while(true) {
            int a = tmp / 10; // 앞자리
            int b = tmp % 10; // 뒷자리
            int c = b * 10; // 뒷자리가 앞에 올 때 10을 곱해줌

            int sum = c+((a+b)%10); // 뒷자리가 앞에 올때와 앞자리 뒷자리합의 뒷자리를 구함
            tmp = sum; //이를 다시 대입시켜줌
            cnt++; //카운트를 올려줌
            if(sum==i)break;

        }
        System.out.println(cnt);
    }
}
