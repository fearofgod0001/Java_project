package 상근이알람_TEST;

import java.util.Scanner;

//상근이는매일 지각한다.
//시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정 되도록 함.
//24시간제
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {

            System.out.print("시간을 입력하세요 : ");
            int time = sc.nextInt();
            int min = sc.nextInt() - 45;


            if (min >= 0) {
                System.out.println(time + " : " + min);

            } else if (min < 0) {
                time -= 1;
                min += 60;

                if (time < 0) {
                    time += 24;
                }
                System.out.println(time + " : " + min);
            }
        }
    }
}
