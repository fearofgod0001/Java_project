package 배수찾기;

//문제 : 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
//입력 : 첫째 중에 n이 주어짐, 다음 줄에 한줄에 한개씩 목록에 한 개씩 목록에 들어 있는 수가 주어짐
//출력 : 목록에 있는 수가 n의 배수인지 아닌지 구한 후 라래처럼 출력

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleSearchEx {
    public static void main(String[] args) {


    List<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int val;
    while(true){ //항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출 조건이 필요
            val = sc.nextInt();
            if(val==0)break;
            list.add(val);
        }
    for(Integer v : list){
        if(v%n == 0)System.out.println(v + "is multiple of " + n + ".");
        else System.out.println(v + "in NOT multiple of" + n + ".");
        }
    }
}