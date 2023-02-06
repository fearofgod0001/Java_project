package 흐테스트;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); //1.수를 입력받음
        int ii = 0; //나머지 값
        int div = i; // 몫이 들어갈 값 2. 입력받은 수를 div에 대입
        int sum = 0;//10진수 결과 값
        String str = ""; // 2진수 결과값

        while(true){
             ii = div%2; //3. 몫에 대한 나머지 값을 구함
             div = div/2;//4. 몫을 구함
             str += ii; // 5. 나머지를 String 문자열에 쌓아줌
             if(div==0)break; // 몫이 0 일 때 끝남
            }

        System.out.print("이진수 : ");
        for(int ir=str.length()-1;ir>=0;ir--){
            System.out.print(str.charAt(ir));
        } // 7. 나온결과값은 0101 이므로 이를 역으로 출력해줌
        System.out.println();


        for(int ir =0; ir <str.length(); ir++){// 8. 결과값 0101을 2의 배수로 곱하며 그 값을 더해줌
            sum+=(Math.pow(2,ir)) * Character.getNumericValue(str.charAt(ir));
        }
        System.out.println("십진수 : "+sum); //9. 십진수 출력



    }
}
