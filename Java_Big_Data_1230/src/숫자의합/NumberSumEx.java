package 숫자의합;

import java.util.Scanner;

public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String  n = sc.nextLine();
            String [] arr = n.split("");
            int sum = 0;
            for(int i = 0; i< arr.length;i++ ){
                sum+=Integer.parseInt(arr[i]);
            }
            if(n.equals("0000"))break;
            System.out.println(sum);
        }
    }
}
