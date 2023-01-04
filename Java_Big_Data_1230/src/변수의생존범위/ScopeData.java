package 변수의생존범위;

import java.util.*;

//변수는 사라져 주어야함.
//상수 : 변수와 마찬가지로 데이터를 저장할 수 있는 메모리공간.
//- 변수와 다른 점은 프로그램이 실행되는 동안 값이 변경이 안됨.
// 자바에서 상수는 final 키워드로 정의하고 단, 한번만 값을 설정할 수 있다.
public class ScopeData {
    public static void main(String[] args) {
        final double taxRate = 0.1;
        Scanner sc = new Scanner(System.in);
        System.out.print("수입을 입력하세요 : ");
        int income = sc.nextInt();

        System.out.println("당신의 내야할 세금은 " + income * taxRate + "원 입니다");

    }
}
