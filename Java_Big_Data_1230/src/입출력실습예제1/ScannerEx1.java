package 입출력실습예제1;

import java.util.Scanner;

//이름 주소 성별 나이 전화번호를 입력 받아 출력해보기
public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("주소 : ");
        String addr = sc.nextLine();

        System.out.print("성별 : ");
        String sex = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.println("======회원 정보 출력 ======");
        System.out.println("이름 : " +name);
        System.out.println("주소 : " +addr);
        System.out.println("성별 : " +sex);
        System.out.println("나이 : " +age);


    }
}
