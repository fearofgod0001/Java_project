package 평균은넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class AboveAver {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] rst = new double[testCnt];
        for(int i=0; i< rst.length; i++){
            rst[i] = OverRate();
        }
        for(double e : rst){
            System.out.println("%.3f%%\n");
        }
    }


    //각테스트 케이스에 대한 결과를 구해서 실수 형태의 백분율로 반환
    //학생수 입력 받고 입력받은 학생 수 만큼의 성적을 입력받음
    //평균을 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함
    //구해진 평균을 가지고 각각의 입력 받은 성적을 비교해 평균을 넘는 학생수를 구함
    //구해진 학생수를 100분율로 변환해서 반환
    static double OverRate() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine()); //학생 수
        int ttl = 0;// 총점 구하기 위한 변수
        int overCnt = 0; //평균을 넘는 학생의 수 구하는 변수
        int[] score = new int[cnt];
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine()); // 학생의 수 만큼 성적을 입력 받아 배열에 대입
            ttl = ttl + score[i]; //학생의 수만큼 입력된 성적을 누적해서 총점구함
        }
        double aver = (double) ttl / cnt;
        for(int e : score){
            if(e > aver) overCnt++;
        }
        return (double)overCnt/cnt*100;
    }
}


