package 상근날도;

import java.util.Scanner;

//햄버거는 3개의 종류
// 음료 2가지 종류
// 입력 총 5개의 값을 연속으로 입력 하는데 햄버거 3개 음료 2개 순으로 입력
// 입력된 값 중 가장 싼 햄버거, 가장 싼 음료 선택 세트메뉴는 50원 할인
// 총 세트 메뉴의 금액을 구해라
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++){

            arr[i] = sc.nextInt();
        }

        int hammin = arr[0];
        int cokmin = arr[0];

        for(int i=0; i <=2 ;i++){
            hammin = Math.min(arr[i],hammin);
        }
        for(int i=3; i <=4;i++){
            cokmin = Math.min(arr[i],cokmin);
        }



        System.out.printf("햄버거의 가격은 %d 음료의 가격은%d 세트 가격은 %d",hammin,cokmin,(hammin+cokmin-50));
    }
}
