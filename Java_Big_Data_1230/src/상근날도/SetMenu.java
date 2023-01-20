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

        int menu[] = new int[5]; //5개 메뉴
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < menu.length; i++){

            menu[i] = sc.nextInt();//배열의 길이만큼 값을 계속 입력받음
        }

        int minBurger = menu[0];
        int minDrink = menu[3];

        for(int i=0; i <=2 ;i++){
            minBurger = Math.min(menu[i],minBurger);
        }
        for(int i=3; i <=4;i++){
            minDrink = Math.min(menu[i],minDrink);
        }



        System.out.printf("햄버거의 가격은 %d 음료의 가격은%d 세트 가격은 %d",minBurger,minDrink,(minBurger+minDrink-50));
    }
}
