package 정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {


    public static String gerCurrentData(String fmt) { // 불러다 찍기만 하면 됨 생성자 객체를 따로 만들 필요가 없음.
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());

    }
    final static String DOMAIN = "198.168.0.1";
}
