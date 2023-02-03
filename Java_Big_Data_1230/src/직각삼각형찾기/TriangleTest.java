package 직각삼각형찾기;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        while (true) { // 0 0 0 이 들어올 때 까지 반복 수행
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum == 0) break;
            Arrays.sort(arr);
            if ((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
}
