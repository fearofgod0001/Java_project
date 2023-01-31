package HashMap기본;
/*키와 값으로 구성 되어 있음. 키 중복 여부 확인은 hashCode()를 통해서 수행 함.
* 키의 중복은 허용하지 않음, 값은 중복 가능
* 경우에 따라서 hashCode()와 equals() 메소드를 오버라이드 해서 사용해야 함.
* HashMap은 성능이 우수하고 멀티스레드 환경을 지원하지 않음. (동기화 기능 없음)
* HashTable은 HashMap 내부 구조가 동일하며, 멀티스레드 지원
* Properties는 HashTable을 상속 받아서 기능을 제약하여 사용
*
* */

import java.util.*;
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호 ", 80);
        map.put("동그라미", 98); //키가 같기 때문에 값이 나중의 값으로 대체 됨


        System.out.println("총 Entry : " + map.size());
        System.out.println("객체 찾기 : " + map.get("동그라미"));

        //맵을 순회하는 방법 : 향상된 for문
        for(String v : map.keySet()){
            System.out.println(v + "\t" + map.get(v));
        }
        //반복자로 순회 하는 방법
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next(); // 키를 가져옴
            System.out.println(key + " : " + map.get(key));
        }


        //객체 삭제
        map.remove("동그라미");
        System.out.println("총 en 수" + map.entrySet());

        //값을 수정하는 메소드
        map.replace("이준호 ",91);

        //map.Entry 전체삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.entrySet());


    }
}
