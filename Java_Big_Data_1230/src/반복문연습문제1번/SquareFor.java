package 반복문연습문제1번;

import java.io.*;

// 양의정수 n을 받아서 정사각형 만들기
public class SquareFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


            for(int i=1;i<=n*n;i++){
                System.out.printf("%4d",i);
                if(i%n ==0) System.out.println();
            }
        }
    }

