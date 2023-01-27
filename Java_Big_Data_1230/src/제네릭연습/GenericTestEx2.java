package 제네릭연습;

import java.awt.event.WindowFocusListener;

//제네릭 타입 : 타입 변수를 사용해 다형성 구현
public class GenericTestEx2 {
    public static void main(String[] args) {
        Person<Integer> person = new Person<>(123);
        System.out.println(person.info);

        Person<String> person1 = new Person<>("dxt");
        System.out.println(person1.info);
    }
}

/*
'T' 타입 변수라고 하며, 임의의 참조형 타입을 의미,
'T' 변수명을 의미하며 아무 이름으로 지어도 됨(일반적으로 대문자T)

*/
class Person <T>  {
    public T info; //변수 선언 없음 들어오는 타입으로 바뀌겠다. 라는 의미
    Person(T info){
        this.info = info;

    }
}
