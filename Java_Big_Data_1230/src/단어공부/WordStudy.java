package 단어공부;

import java.util.Arrays;
import java.util.Scanner;

// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대문자를 입력하고 결과는 대소문자 구분 하지 않음.
// 만약 가장 많이 등장하는 알파벳이 하나가 아닌 경우 ? 로 출력
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 갯수만큼 배열 생성
        int max = 0; // 제일 큰 수 찾기
        char result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("단어 입력 : ");
        String word = sc.next();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) -'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i =0; i<alphabet.length; i++){
            if(alphabet[i]==max )result = '?'; // 배열 인덱스의 값과 max 값이 같으면 '?'
            else if(alphabet[i] > max){
                max = alphabet[i]; // 인덱스에 해당하는 배열 값이 더 크면 max 값을 변경
                result = (char) ('A' + i); // 배열의 인덱스에서 'A'
            }
        }
        System.out.println(result);

//
//        String find = sc.next();
//        String [] al = find.split("");
//        int [] ar = new int[al.length];
//        int tmp = 0;
//        int answer = 0;
//        for(int i = 0; i < al.length; i++){
//            for(int j = 0;j<al.length; j++){
//                if(al[i].equalsIgnoreCase(al[j])){
//                    ar[i]++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(al));
//        System.out.println(Arrays.toString(ar));
//
//
//        for(int i  = 0; i < ar.length; i++){
//              if(ar[i]>tmp){
//                  tmp = ar[i];
//                  answer = i;
//               }
//        }
//        System.out.println(al[answer]);

    }
}
