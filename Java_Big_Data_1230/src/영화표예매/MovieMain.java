package 영화표예매;
// 클래스를 만들고 객체 생성
// 극장 좌석은 10개 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에는 현재 좌석의 예약상태를 보여주고 예약을 받음
// 종료 판매된 좌석의 개수를 확인해서 판매 금액을 구함.

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        Scanner sc = new Scanner(System.in);

        while(true) { // 예약은 종료하기를 누르기 전까지는 계속 진행해야 함.
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1) mt.selectSeat();
            else{
                System.out.println(mt.totalAmount());
                break;
            }

        }
    }
}
