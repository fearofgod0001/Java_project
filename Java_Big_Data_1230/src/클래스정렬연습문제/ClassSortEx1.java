package 클래스정렬연습문제;

import 커피메뉴만들기.MenuInfo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*학생의 수를 입력 받기
 학생의 수만큼 객체를 생성하여 정보를 입력받음
학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순으로 정렬
 그리고 출력시 등수가 표기 되도록 할 것
 [입력 예시]
 학생 수 입력 :
 안유진 99 202301
 정국 87 202302
 채연 88 202303

 [출력 예시]

*/
public class ClassSortEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<StudentEx1> st = new TreeSet<>(new Descendcomp2());


        System.out.println("학생 수를 입력하세요 : " );
        int key = sc.nextInt();
        int j = 1;
        int preScore = 0;
        for(int i = 0; i< key;i++){
            st.add(new StudentEx1(sc.next(), sc.nextInt(), sc.nextLine()));
        }



        for(StudentEx1 e : st){
            if(preScore != e.score)j++;
            System.out.println(j + "  " + e.score + "  " + e.name + "  " + e.idCode);
            preScore = e.score;
        }

    }
}
