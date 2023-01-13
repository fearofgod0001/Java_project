package 상속실습예제;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    int age;
    int sleep;
    void setAge(){
        this.age = age;
        System.out.print("나이를 입력하세요 :");
        age = sc.nextInt();
    }
        void setSleep(){
        this.sleep=sleep;
        System.out.print("수면 시간을 입력하세요 :");
        sleep= sc.nextInt();
    }
    void iofoPerson(){
        System.out.println("나이는 " + age + "살 입니다.");
        System.out.println("평소 " + sleep +"시간 잠을 잡니다.");
    }
}

class Workman extends Person{
    Scanner sc = new Scanner(System.in);
    int work;
    void setWork(){
        this.work = work;
        System.out.print("평균 근무 시간을 입력하세요 :");
        work = sc.nextInt();
    }

    @Override
    void iofoPerson() {
        super.iofoPerson();
        System.out.println("평균 " + work +"시간 일 합니다.");
    }
}

class Student extends Person{
   Scanner sc = new Scanner(System.in);
    int study;
    int n;
    void setStudy(){
        this.study=study;
        System.out.print("평균 몇시간 공부하나요? : ");
        study = sc.nextInt();
        System.out.println("얼마나 열심히 공부하나요 ?");
        System.out.println("[1]:열심히, [2]:적당히, [3]:놀면서");
        n = sc.nextInt();

    }

    @Override
    void iofoPerson() {
        super.iofoPerson();
        System.out.println("평균 "+study+"시간 공부 합니다.");
        if(n==1)System.out.println("열심히 공부합니다.");
        if(n==2)System.out.println("적당히 공부합니다.");
        else System.out.println("놀면서 공부합니다.");
    }
}