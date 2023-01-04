package 윤년구하기_Test;

import java.util.Scanner;

/*
1. 4로 나누어지면 윤년이다.
2. 100으로 나누어지면 윤년이 아님
3. 400으로 나누어지면 윤년임

 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i <= 100; i++) {
            System.out.print("년도를 입력하세요 : ");
            int y = sc.nextInt();
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                System.out.println(y + " 년은 윤년입니다.");
            } else {
                System.out.println(y + "년은 윤년이 아닙니다.");
            }
        }
    }
}
