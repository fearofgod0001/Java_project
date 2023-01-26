package 열거타입;

import java.util.Calendar;

//열거타입(enum) : 한정된 값인 열거 상수 중에서 하나의 상수를 저장하는 타입
// 열거체를 비교 할 때 실제 값 뿐만 아니라 타입 체크가 가능.
public class EnumType {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch (week){
            case 1 : today = Week.Sunday;
            case 2 : today = Week.Mon;
            case 3 : today = Week.Tues;
            case 4 : today = Week.Wed;
            case 5 : today = Week.Thur;
            case 6 : today = Week.Fri;
            case 7 : today = Week.Sat;

        }
        System.out.println(today);
    }

}
