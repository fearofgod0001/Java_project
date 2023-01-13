package 상속실습예제;

import java.util.Scanner;

//인간(Person)이라는 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) 몇살
// - sleep : 잠 잔다는 특징 (정수 값 사용, 게터/세터) 몇시간 잘껀지
// 인간 - > 직장인 생성
// - work : 몇시간 일하는지 (정수, 게터/세터)
// 인간으로 부터 학생을 생성
// - study : 공부하는 특성 (1 입력"열심히 , 2"적당히", 3"놀면서")
public class InheritanceEx1 {
    public static void main(String[] args) {

        Student student = new Student();
        student.setAge();
        student.setSleep();
        student.setStudy();
        student.iofoPerson();

        System.out.println();
        Workman workman = new Workman();
        workman.setAge();
        workman.setSleep();
        workman.setWork();
        workman.iofoPerson();
    }

}
