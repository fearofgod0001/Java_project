package PC방알바;
//피씨방에 피씨가 100대 (배열의 인덱스  0~99)
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음
// 만약 자기가 앉고 싶어 하는 자리에 다른 손님이 있으면 거절을 해야하고 아니면 자리가 사용 허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는 자리 번호 : 12 13 14 = 0(거절 횟수)
// 손님의 수 입력 : 5
// 자리 번호 : 9 10 11 12 13 = 2(거절 횟수)

import java.util.Scanner;

public class PcRoomEx {
    public static void main(String[] args) {
        // 피시방 좌석 100개 배열
        // 배열의 초기 값은 0. 즉 비어 있는 자리이다.
        int[] pcRoom = new int[100];
        int rejectCnt = 0; //거절 횟수
        int seatNum; // 손님이 원하는 좌석 번호를 입력받기 위한 변수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//손님의 수를 입력받음
        for (int i = 0; i < n; i++) {
            seatNum = sc.nextInt();
            if (pcRoom[seatNum - 1] == 1) { // 해당 배열의 값이 1이라는 건 이미 예야고딘 자리다
                rejectCnt++;
            } else {
                pcRoom[seatNum - 1] = 1; //비어 있는 자리를 사용 하여 1을 넣음
            }
        }
        System.out.println(rejectCnt);

    }
}
