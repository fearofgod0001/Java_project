package 영화표예매;

import java.util.Arrays;
import java.util.Scanner;

//현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 개수를 구해 총금액을
public class MovieTicket {
    //극장의 좌석 상태를 표시하는 배열만들기

    int seat[] = new int[10];

    // 현재 좌석 상태를 보여주는 메소드 작성
    // 0 이면 [] 1이면 [V]로 출력
    void printSeat() {
       for(int i = 0 ; i<seat.length; i++){
           if(seat[i] == 0) System.out.print("[ ] ");
           else System.out.print("[V] ");
       }
       System.out.println();
    }

    //좌석을 예약하는 메소드
    void selectSeat() {
        // 먼저 현재 상태를 보여주어야 함.
        // 좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력
        // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌
        printSeat();
        Scanner sc = new Scanner(System.in);
        int seatPos = sc.nextInt();
        if(seat[seatPos-1] == 0 ){
            seat[seatPos-1] = 1; // 좌석 판매
            printSeat(); //판매 후 갱신된 정보를 화면에 보여줌
        } else {
            System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택하세요.");
        }
    }

    int totalAmount() {
        int cnt = 0;
        for(int val : seat){
            if(val==1) cnt++;
         }

        return 12000 * cnt;
    }
}
