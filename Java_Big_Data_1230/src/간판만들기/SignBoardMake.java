package 간판만들기;

import java.io.*;
import java.util.*;

//0은 4칸 1은 2칸 나머지 수는 3칸을 차지 여백 1칸
// 5611 = 1 + (3 + 1) + (3 + 1) + (2 + 1) + (2 + 1) = 15
// 120 = 1+ 2 + 1 + 3+ 1+ 4 + 1 = 13
// 입력은 0 이 들어 올 때 까지 계속 반복
public class SignBoardMake {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(;;){
        int cnt = 1;
        System.out.print("숫자를 입력하세요 : ");
        String number = br.readLine();
        int [] arr = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i <arr.length; i++){
            if(arr[i] == 0){
                cnt +=5;
            }else if(arr[i] == 1){
                cnt +=3;
            }else{
                cnt +=4;
            }
        }
        if(number.equals("0")){
            System.out.println("시스템을 종료합니다.");
            break;
     }
            System.out.println("총 값은 : " + cnt);
        }

    }
}
