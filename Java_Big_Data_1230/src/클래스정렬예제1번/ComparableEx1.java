package 클래스정렬예제1번;
// Comparable은 클래스 정렬을 구현 할 수 있도록 해주는 인터페이스이며 TreeSet 컬렉션에서 사용해야 함
// compareTo() 메소드를 오버라이딩해서 정렬 조건을 구현 해야 함. 정렬 조건은 자신의 객체와 매개변수로 입력받은 객체를 비교
// 정렬 조건은 자신의 객체와 매개변수로 입력 받은 객체를 비교
// 정렬 조건은 양의 정수 값을 반환하면 정렬 조건이 됨
// 정렬 조건을 0으로 반환하면 Set의 특성으로 인해 동일

import java.util.TreeSet;

public class ComparableEx1 {
    public static void main(String[] args) {
    TreeSet<CarSort> ts  = new TreeSet<>();

        ts.add(new CarSort("싼타페","흰색",2016));
        ts.add(new CarSort("쏘렌토","은색",2012));
        ts.add(new CarSort("그랜저","검정",2022));
        ts.add(new CarSort("g80","은색",2022));




        System.out.println("생성된 객체의 수 : " + ts.size());

        for(CarSort e : ts){
            System.out.println("차종 : " + e.modelName + "/ 연식 : " +e.modelYear + "/ 컬러 : " + e.color);
        }
    }
}
