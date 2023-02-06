package 알고리즘문제0203;

import java.util.Scanner;

public class EightTest1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String eg = sc.nextLine();
        String egg[] = eg.split("");
        String sum = "";
        for(int i=0; i< egg.length; i++){
            switch (egg[i]){
                case "0" : sum += "000"; break;
                case "1" : sum += "001"; break;
                case "2" : sum += "010"; break;
                case "3" : sum += "011"; break;
                case "4" : sum += "100"; break;
                case "5" : sum += "101"; break;
                case "6" : sum += "110"; break;
                case "7" : sum += "111"; break;
            }
        }
        int i = Integer.parseInt(sum);
        System.out.println(i);
    }
}
