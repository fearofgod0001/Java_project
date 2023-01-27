package 손익분기점;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        double ttl = 0;

        if(B>=C){
            ttl = -1;
        }else if(A%(C-B)==0){
            ttl = (A/(C-B));
        }else{
            ttl = Math.ceil(A/(C-B));
        }
        System.out.println((int)ttl);

    }
}
