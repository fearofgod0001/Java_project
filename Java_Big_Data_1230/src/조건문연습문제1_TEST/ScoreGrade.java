package 조건문연습문제1_TEST;

import java.util.Scanner;

//성적이 0 에서 100 사이가 아니면
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.print("점수를 입력하세요 : ");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {

                if (score >= 90) System.out.println("A");
                else if (score >= 80) System.out.println("B");
                else if (score >= 70) System.out.println("C");
                else if (score >= 60) System.out.println("D");
                else System.out.println("F");
            } else {
                System.out.println("잘못입력했습니다.");
            }
        }
    }
}
