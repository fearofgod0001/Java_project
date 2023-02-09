package 흐테스트;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt(); //1.수를 입력받음
//        int ii = 0; //나머지 값
//        int div = i; // 몫이 들어갈 값 2. 입력받은 수를 div에 대입
//        int sum = 0;//10진수 결과 값
//        String str = ""; // 2진수 결과값
//
//        while(true){
//             ii = div%2; //3. 몫에 대한 나머지 값을 구함
//             div = div/2;//4. 몫을 구함
//             str += ii; // 5. 나머지를 String 문자열에 쌓아줌
//             if(div==0)break; // 몫이 0 일 때 끝남
//            }
//
//        System.out.print("이진수 : ");
//        for(int ir=str.length()-1;ir>=0;ir--){
//            System.out.print(str.charAt(ir));
//        } // 7. 나온결과값은 0101 이므로 이를 역으로 출력해줌
//        System.out.println();
//
//
//        for(int ir =0; ir <str.length(); ir++){// 8. 결과값 0101을 2의 배수로 곱하며 그 값을 더해줌
//            sum+=(Math.pow(2,ir)) * Character.getNumericValue(str.charAt(ir));
//        }
//        System.out.println("십진수 : "+sum); //9. 십진수 출력
//
        System.out.println("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("이진수 : " + val);
        val = binToDec(val);
        System.out.println("십진수 : " + val);




    }

    static int decToBin(int dec) { //10진수를 입력 받아서 2진수 변환
        int calc; // 계산으로 만들어진 이진수
        int bin = 0; // 최종 결과
        int pos = 1; // 자리 이동을 위한 포지션 변수
        while(dec !=0){
            calc = dec %2;
            bin = bin + calc * pos;
            pos *= 10;


        }
        return bin = 0;
    }

    static int binToDec(int bin) { //2진수를 입력받아 10진수 반환
        int dec = 0;//최종결과
        int i =0; //인덱스 계산용 변수
        int tmp; // 계산을 위한 임시 값 저장용
        while(bin !=0){
            tmp = bin%10; // 10으로 나눈 나머지 구함
            bin /=  10;
            dec += tmp*Math.pow(2,i++);
        }

        return dec;
    }


}
