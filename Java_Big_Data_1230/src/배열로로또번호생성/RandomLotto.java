package 배열로로또번호생성;

import java.util.Arrays;
import java.util.Random;

//1~45사이의 임이의 수 6개로 구성
// 배열로 로또 번호를 생성해 출력
// 2. 배열로 로또 번호 생성(중복 제거)
// 3. 다른 자료구조를
public class RandomLotto {
    public static void main(String[] args) {
        // 정수행 배열 생성, 갯수는 6개
        // 반복문 (6회를 만들어 순회하면서 1~45사이의 임의의 숫자를 배열에 대입
        // 배열의 요소를 출력

        int[] arr = new int[6];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rnd.nextInt(6) + 1;

            for (int j = i; j>=0; j--) {
                if (arr[i] == arr[j]) {
                    arr[i] = rnd.nextInt(6)+1;

                    System.out.println(i +" 번째 값 "+arr[i]+" 과 "+ j +" 번 째 값 "+ arr[j]+" 는 중복입니다.");
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
