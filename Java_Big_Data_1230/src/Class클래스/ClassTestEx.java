package Class클래스;

import java.util.Scanner;

//Class : 클래스의 패키지 이름이나 클래스이름 등의 정보를 가져옴
public class ClassTestEx {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass(); // 해당 클래스의 정보를 가져 옴
        System.out.println(c);

        Person person = new Person();
        Class pCls = person.getClass();
        System.out.println(pCls.getSimpleName());
        System.out.println(pCls.getClass());
        Man man = new Man();
        Class mCls = man.getClass();
        System.out.println(mCls.getClass());
        System.out.println(mCls.getSimpleName());


    }
}


class Person{

}

class Man extends Person{

}