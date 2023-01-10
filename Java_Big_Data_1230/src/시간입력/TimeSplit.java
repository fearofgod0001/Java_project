package 시간입력;
//입력 : 23:5:5 (24시간제로 시간을 콜론 기준으로 입력

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class TimeSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("시간을 입력하세요 : ");

        String time = br.readLine();
        int [] tChange =  Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();




        if(tChange[0] >= 13){
            System.out.printf("오후 %02d시 %02d분 %02d초",tChange[0]-12,tChange[1],tChange[2]);
        }else{
            System.out.printf("오전 %02d시 %02d분 %02d초",tChange[0],tChange[1],tChange[2]);
        }
    }
}
