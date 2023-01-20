package 객체타입확인;
//instanceof : 개체 타입 확인 연산자 , 부모와 자식 관계 성립 여부를 확인
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent);//t
        System.out.println(child instanceof Parent);//t
        System.out.println(child instanceof Child);//t
        System.out.println(parent instanceof Child);//t





    }
}

class Parent{
    String name;
    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
        this.name = name;
    }
}
