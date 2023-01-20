package 메소드만들기;

import java.util.Scanner;

// 메소드 이름 규칙 : 변수 만드는 규칙과 동일
// camel 표기번 사용
// 접근제한자 반환타입 메소드이름(매개변수목록){
public class ClassMethod {
    public static void main(String[] args) {
        Sample sm = new Sample(); // 클래스 내에 생성자가 없으면 ()칸을 비움

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 값 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sm.sum(n1,n2); // sum()
        System.out.println(rst);

      sm.say(); //호출하기 위해서는 클래스를 객체로 만들고 객체의 메소드로 접근
        System.out.println(sm.sayStr());

        int rst2 = sm.sum(1,2,3,4,5);
        System.out.println(rst2);
    }
}
