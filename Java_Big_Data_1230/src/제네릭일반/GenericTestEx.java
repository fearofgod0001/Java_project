package 제네릭일반;

import java.util.ArrayList;
import java.util.List;

//컴파일 시 강한 타입체크  / 자바 8 이전 대비 변경 사항
// 타입 변환 제거 / 자바 8 이전 대비 변경 사항
public class GenericTestEx {
    public static void main(String[] args) {
//        List list = new ArrayList(); // 자바 8 이전 대비 변경 사항
//        list.add("안녕하세요");
//        String str = (String) list.get(0);

        // 제네릭 타입
        //list에서 사용할 데이터타ㅣ입을 미리 지정하면서 컴파일 시 타입체크가 일어나도록 함.
        List<String> list = new ArrayList<>();
        list.add("hello");
        String str = list.get(0);
        System.out.println(str);

    }
}
