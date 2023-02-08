package 흐테스트;

import java.util.Scanner;

public class BlackJackTesst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int sum = 0; //3장 카드의 합
        int rst = 0; // 3장 카드의 합으로 만들어진 결과값
        int [] arr = new int[n];

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<arr.length;i++){
            for(int j = i+1 ; j<arr.length;j++){
                for(int k = j+1 ; k <arr.length;k++){
                    sum = arr[i]+arr[j]+arr[k];

                    if(sum<=m && rst <sum)rst = sum;
                }
            }
        }
        System.out.println();

    }

}
