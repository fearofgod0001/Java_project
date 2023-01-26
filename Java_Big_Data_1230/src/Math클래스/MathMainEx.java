package Math클래스;
// Math 클래스의 모든 메소드는 클래스 메소드 이므로 객체를 생성하지 않고 바로 사용 함.
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환
// 7자리의 로또 번호 생성
// 7개의 배열을 만들고 첫번째 부터 여섯 번째는 0 ~50사이의 임의의 수 생성 후 대입
// 마지막 7 번째 자리는 50~100사이의 임의의 수로 만들어서 대입하고 , 한번의 출력

import java.util.Arrays;
import java.util.Scanner;

public class MathMainEx {
    public static void main(String[] args) {
        int[][] lotto = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                lotto[i][j] = ((int) (Math.random() * 50+1));
                if (j == 6) {
                    lotto[i][j] = ((int) (Math.random() * 50+1) + 50);
                }
            }
        }
                for (int i = 0; i < 7; i++) {
                    for(int j = 0; j<7;j++){
                        System.out.printf("%3d",lotto[i][j]);
                        if(j == 6){
                            System.out.println("");
                        }
                    }

        }
        //abs() 메소드 : 절대값 구하기
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-3.14));

        //floor() 소숫점 이하를 무조건 날림
        //ceil() : 소수점 이하가 있으면 올림
        //round() : 반올림
        System.out.println(Math.floor(10.1111));
        System.out.println(Math.ceil(10.1111));
        System.out.println(Math.round(10.6111));
        System.out.println(Math.round(10.2111));

        //min max
        System.out.println((int)(Math.max(1,3.99)));
        System.out.println(Math.min(1,3));

        //pow()
        System.out.println((int)(Math.pow(2,2)));
    }
}