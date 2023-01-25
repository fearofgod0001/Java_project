package 저항;

import java.util.Scanner;

/* 전자 제품에서는 저항이 들어감. 처음음 색2개는 저항의 값, 마지막은 곱해야 하는 값
색 : black .
* */
public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        String [] value = {"0","1","2","3","4","5","6","7","8","9"};
        int [] mul ={1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        String color1 = sc.next();
        String color2 = sc.next();
        String color3 = sc.next();
        int firrst = 0, sndrst = 0, trdrst = 0;

        for(int i =0; i< color.length;i++){
            if(color1.equals(color[i])) firrst = i;
            if(color2.equals(color[i])) sndrst = i;
            if(color3.equals(color[i])) trdrst = i;
        }
        //Math.pow(10,몇 승인지)
        String rstt = value[firrst] + value[sndrst] ;
        System.out.println(rstt);
        long result = Long.parseLong(rstt) * mul[trdrst];
        System.out.println(result);


    }
}
