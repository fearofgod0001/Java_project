package 반복문유효값체크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//반복문을 이용해서 유효값 체크
public class ValidCheck {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age;

        while(true){
            System.out.print("나이를 입력하세요 : ");
            age = Integer.parseInt(br.readLine());
            if(age > 0 && age <200)break;
            System.out.println("나이를 잘못 입력하셨습니다.");

        }
        System.out.println("입력하신 나이는  " + age);
    }
}
