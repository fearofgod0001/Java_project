package 주사위게임_TEST;

import java.util.Random;

//주사위 두개를 던져서 합이 12면 탈출 하는 게임
public class DiceGame {
    public static void main(String[] args) {
        Random rd = new Random();
        int cnt = 0;

        while (true) {
            cnt ++;
            int n = rd.nextInt(6)+1;
            int m = rd.nextInt(6)+1;
            int l = (int)((Math.random()*6)+1); //랜덤 함수는 더블형 인트로 선언 0부터 5까지 +1 추가
            if (n + m ==12) {
                System.out.printf("주사위는값은 각각 %d, %d 입니다 합은 %d 입니다\n",n,m,(n+m));
                System.out.println("무인도를" +cnt +"번 만에 탈출합니다.");
                break;
            }else {
                System.out.printf("주사위는값은 각각 %d, %d 입니다 합은 %d 입니다\n",n,m,(n+m));
            }

        }
    }
}
