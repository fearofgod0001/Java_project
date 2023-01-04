package 스위치문기본;
//스위치문은 조건문이며 스위치에는 조건식은 올 수 없고 조건에 대한 변수만 올 수 있다.
// 변수는 정수 문자 문자열만 사용가능
// 스위치의 각 케이스를 끝내기 위해서는 break문을 사용
// 해당하는 케이스가 없는 경우를 위해 default 문이 필요

import java.io.*;

public class SwtitchSeason {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(;;) {
            System.out.print("계절을 입력하세요  : ");
            String season = br.readLine();
            switch (season) {
                case "spring":
                case "SPRING":
                    System.out.println("봄 입니다.");
                    break;

                case "summer":
                    System.out.println("여름 입니다.");
                    break;

                case "fall":
                case "autumn":
                    System.out.println("가을 입니다.");
                    break;
                case "winter":
                    System.out.println("겨울 입니다.");
                    break;
                default:
                    System.out.println("계절을 잘 못 입력 하셨습니다.");
                    break;
            }

        }
    }
}
