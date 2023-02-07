package 흐테스트;

import java.util.Scanner;

public class TESTEC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine(); //알파벳 입력
        int [] alarr = new int[alphabet.length()]; //입력된 값에 맞는 숫자를 넣을 배열 정의

        for(int i = 0; i<alphabet.length();i++){
            if(alphabet.charAt(i)>='a'){ //소문자면 아스키코드 96 뺄셈
                alarr[i] = (int)alphabet.charAt(i) -'a' + 1;
            }else if(alphabet.charAt(i)>='A'){//대문자면 아스키코드 38 뺄셈
            alarr[i] = (int)alphabet.charAt(i) - 'A' + 27;
             }
        }


        int sum = 0; //전체 합을 담을 변수
        for(int i = 0; i<alarr.length;i++){ //숫자 값 배열의 전체 합 구하기
            sum+=alarr[i];
        }
        System.out.println(sum);

        int cnt =0; //3번이상 나누어지면 소수가 아니다
        for(int i =1; i<=sum ;i++){
            if(sum%i == 0)cnt++;
            if(cnt==3)break;
        }

        if(cnt <3) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
 }
}
