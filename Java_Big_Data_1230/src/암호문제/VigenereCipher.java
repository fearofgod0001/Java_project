package 암호문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VigenereCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vc = sc.nextLine(); //평문
        String encrypt = sc.next(); // 암호화 될 키
        char[] enc = encrypt.toCharArray(); // 입력 받은 암호화키를 배열로 만듬
        char value = 0;// 암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();
        for(int i =0;i<vc.length();i++) {
            if (vc.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char) (vc.charAt(i) - (enc[i % encrypt.length()] - 'a')-1);
                if(value <'a')value+=26;
                vig.add(value);
            }
        }
        for(Character e: vig)System.out.print(e);
        System.out.println();


        String love = "lovelove";


        for(int i =0; i <vc.length(); i++) {
            if(vc.charAt(i)==32){
                System.out.print(" ");
            }else if((char)(vc.charAt(i)+96-love.charAt(i)) > 122){
                System.out.print((char)(vc.charAt(i)+96-love.charAt(i)-26));
            } else if ((char)(vc.charAt(i)+96-love.charAt(i))<97) {
                System.out.print((char)(vc.charAt(i)+96-love.charAt(i)+26));
            } else System.out.print((char)(vc.charAt(i)+96-love.charAt(i)));

        }
    }
}
