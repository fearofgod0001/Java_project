package 스위치문계산기;

import java.io.*;

public class SwtichCalc {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("계산식을 입력하세요 : x ");

        int x = Integer.parseInt(br.readLine());
        char op = br.readLine().charAt(0);
        int y = Integer.parseInt(br.readLine());
        switch (op){
            case '+':
                System.out.println("덧셈 : " + (x+y));
                break;
            case '-':
                System.out.println("뺄셈 : " + (x-y));
                break;
            case '*':
                System.out.println("곱셈 : " + (x*y));
                break;
            case '/':
                System.out.println("나눗셈 : " + (x/y));
                break;
            default:
                System.out.println("사칙연산 기호가 아닙니다.");
        }



    }
}
