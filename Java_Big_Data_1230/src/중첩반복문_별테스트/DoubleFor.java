package 중첩반복문_별테스트;

import java.io.*;
public class DoubleFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("별의 갯수를 입력하세요  : ");
        int a = Integer.parseInt(br.readLine());

        for(int i =0; i<10;i++){
            for(int j = 1; j<10; j++){
                System.out.printf("%d x %d = %d\n",i,j,(i*j));
            }
            System.out.println("--------------");
        }

        for (int i = a; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
