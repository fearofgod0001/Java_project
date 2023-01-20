package 문자열연결;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 주가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라 두번 째 문자열 앞에 입력해주기
public class StringAppend {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫번 째 문자열 입력 : ");
        String fst = br.readLine();

        System.out.print("두번 째 문자열 입력 : ");
        String snd = br.readLine();

        System.out.print("정수를 입력 : ");
        int i = Integer.parseInt(br.readLine());
        
        System.out.print("결과 : ");
        System.out.println(fst.substring(fst.length()-i,fst.length())+snd);

    }
}
