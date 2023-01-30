package 어레이리스트예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// List 인터페이스란? 배열과 비슷한 구조를 가지면 하위에 ArrayList, LinkedList Vector 클래스로 구성됨
// 요소의 저장 순서가 유지, 중복 저장 허용 동적할당(크기 지정을 안해도 됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입, 삭제는 느림
// Vector : ArrayList와 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능 지원하기 때문에
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를
//
public class ArrayListEx1 {
    public static void main(String[] args) {
        String []data  = {"138","145","122"};

        List<String> pitches = new ArrayList<>(Arrays.asList(data)); //List 인터페이스로 ArraList객체를 참조 함 asList()는 이미 만들어진 배열을 리스트로 변경
        pitches.add("131");
        pitches.add("132");
        pitches.add("133");
        pitches.add(1,"130");


        System.out.println(pitches);
        pitches.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(pitches);
        pitches.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(pitches);


        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환함
        System.out.println(pitches.get(5)); // 없는 인덱스를 전달해서 예외가 발생
        System.out.println(pitches.size()); // ArrayList 개수를 반환
        System.out.println(pitches.contains("142"));// 전달된 값이 ArrayList 내에 있는지 확인
        System.out.println(pitches.remove(0)); // 리스트에서 해당 항목을 삭제하고 삭제된 요소를 반환
        System.out.println(pitches.remove("129")); //리스트에서 해당항목을 삭제하고 T/F로 반환


    }
}
