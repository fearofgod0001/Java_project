package 입출력예제;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {

        String name = "진도준";
        String addr = "진양철의 손자";
        char gender = '남';
        int age = 20;
        int kor = 99;
        int eng = 88;
        int mat = 55;

        System.out.println("=========Java Style Output=========");
        System.out.println("Name : " + name);
        System.out.println("Address : " + addr);
        System.out.println("Sex : "+ gender);
        System.out.println("Age : "+ age);
        System.out.println("TTL : "+ (kor + eng + mat));
        System.out.println("Average : " +((double)(kor + eng + mat)/3));
        //c언어 스타일
        //서식지정자 %d, %ld, %u, %f, %.2f, %s, %c, %%, %b
        //이스케이프시퀀스 : \n(줄바꿈) \r( \t(탭) \b(백스페이스) \\
        System.out.printf("=========Java Style Output========="+"\n");
        System.out.printf("나의 이름은 %s 나이는 %d살이며 순양물산의 주인 %s입니다.\n",name,age,addr);
        System.out.printf("평균 : %.2f\n",(double)(kor + eng + mat)/3);


        System.out.println("Hello \\ java");
        System.out.println("Hello \\ java");
        System.out.printf("오늘의 습도는 %d%%\n",25);

        System.out.printf("=========Java Style Output========="+"\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++){
            System.out.printf("%4d",i);
            if(i % n == 0) System.out.println();

        }
    }
}
