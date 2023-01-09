package 대소문자변경;
// 영문자 소문자와 대문자를 이루어진 단어를 입력 받은 뒤 대문자를 소문자로 소문자를 대문자로 변경
//
// 문자열에서 문자를 추출하는 메소드는 charAt(인덱스)이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class UpperLowerChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문자열 입력 : ");
        String a = br.readLine();
        char ch; // 문자열에서 문자를 추출

        for(int i = 0 ; i < a.length(); i++){
                if(a.charAt(i) < 96){
                    System.out.print((char)(a.charAt(i)+32));
                   // a.charAt(i)-='SP';te
                }else{
                    System.out.print((char)(a.charAt(i)-32));
                }
               // System.out.print(a.charAt(i));
            }

            }
        }


