package 배열로로또번호생성;

import java.util.Arrays;
import java.util.Random;

//1~45사이의 임이의 수 6개로 구성
// 배열로 로또 번호를 생성해 출력
// 2. 배열로 로또 번호 생성(중복 제거)
// 3. 다른 자료구조를
public class RandomLotto2 {
    public static void main(String[] args) {
        // 정수행 배열 생성, 갯수는 6개
        // 반복문 (6회를 만들어 순회하면서 1~45사이의 임의의 숫자를 배열에 대입
        // 배열의 요소를 출력

        int[] arr = new int[6];
        int tmp;
        Random rnd = new Random();
        boolean isExist = false;
        int index = 0;
        while(true){
            tmp = rnd.nextInt(45)+1;
            //중복 확인 구간
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] == tmp) isExist =true; // 배열에 중복이 있으면


            }// 생성된 번호가 배열 내에 없으면 저장하는데 인덱스 계산 해줘야 함
            if(isExist == false) arr[index++] = tmp;
            //로또 번호 5개가 만들어졌으면 반복문 탈출
            if(index == arr.length) break;
            // 존배 여부 확인하는 변수를 초기화 시킴
            isExist = false;



        }
        System.out.println(Arrays.toString(arr));

    }
}
