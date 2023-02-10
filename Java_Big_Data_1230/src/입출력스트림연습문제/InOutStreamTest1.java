package 입출력스트림연습문제;

import java.io.*;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
        /*
        1. 적절한 위치에 이름과 성적 파일 생성
        -- TreeSet<클래스> ts = new TreeSet<>();
        2. FileInputStream으로 생성된 파일을 읽기 위한 스트림 생성
        3. 파일을 스캐너를 읽어 들이기 위해 스캐너를 생성하고 스캐너의 입력으로 스트림 연결
        4. 스캐너의 hasNextLine()메소드를 이용해 읽을 라인이 있는 동안 반복 수행
        5. 스캐너의 nextLine()로 라인별로 문자열을 읽어 들임
        6. 입력 받은 문자열을 split을 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입 (요소가 4개인 배열 생성)
        7. 첫번째 요소는 문자열이기 때문에 변환이 필요없고 나머지 연산을 위해 integer.parseInt로 변환
        8. ts.add(new 클래스(생성자));
        9. 향상된 for문을 순회하면서 결과 출력

        1. 이름과 3개의 성적을 객체 단위로 관리 하기 위해 클래스를 생성하고 정렬을 위해 Comparalbe을 상속 받거나 Comparator
        2. Comparable을 상속받아 정렬 기준에 대한 메소드를 오버라이딩 해 정렬에 대한 조건을 구현
        3. 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기.
        */
        TreeSet<StudentInfo> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("D:/Dev/work_java/Java_Big_Data_1230/src/입출력스트림연습문제/score.txt"); //1. 파일을 읽음
        Scanner sc = new Scanner(is); //2. 읽은 파일은 스캐너로 입력

        while(sc.hasNextLine()) { //3. 스캐너기준 다음 라인이 있는지 여부 있으면 true
            String line = sc.nextLine(); //4.있으면 입력
            String arr[] = line.split(" ");
            ts.add(new StudentInfo(arr[0],
                    Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3])));

        }
        for(StudentInfo e : ts){
            System.out.println(e.getName() + " : " + e.getTotal());

        }


    }
}

