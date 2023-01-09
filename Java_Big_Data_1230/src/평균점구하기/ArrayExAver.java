package 평균점구하기;

import java.io.*;

// 상현이가 가르치는 학생은 총5명(유진 유나 채원 카즈하 장원영)
// 기말고사를 치고 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점 성적 조정
// 모든 학생이 보충학습을 들음.
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0 점 이상이고 100점 이하인 5의 배수
public class ArrayExAver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        String [] name = {"유진", "유나","채원","카즈하","장원영"};

        int ttl=0;
        int cnt=0;

        for(int i =0; i< arr.length;i++){

            System.out.print(name[i] + "의 성적을 입력해주세요 : ");
            arr[i] = Integer.parseInt(br.readLine());

            if(arr[i]<40){
                arr[i] =40;
                cnt++;
            }
            ttl += arr[i];
        }

        System.out.println("============");
        System.out.println("보충 수업을 듣는 사람은 "+ cnt +" 명");
        System.out.println("평균 점수는 : "+ ttl/5);

    }
}
