package 클래스정렬연습문제;

import java.util.Comparator;

public class Descendcomp2 implements Comparator<StudentEx1>{
    @Override
    public int compare(StudentEx1 o1, StudentEx1 o2) {
        if(o1.score ==o2.score) {
            return o1.idCode.compareTo(o2.idCode);
        }
        return o2.score - o1.score;
        }
    }

