package 슈퍼필드;
//super : 자식 클래스가 부모클래스로 부터 상속 받은 필드를 참조하는 변수
//super() : 부모 클래스의 생성자를 호출하는 메소드 입니다.(자식의 생성자 내에서 호출)
//자식의 생성자에서 부모의 생성자를 호출할 때는 반드시 부모의 생성자를 먼저 호출하고 다른 초기화를 진행해야함
// 생성자를 따로 만들지 않으면 기본 생성자가 호출되는 것처럼 부모의 생성자도 기본 생성자를 별도로 만들어주지않으면
// 기본적으로 부모의 생성자가 자동 호출 됨.
public class SuperField {
    public static void main(String[] args) {
        System.out.println("main 메소드 호출");
        Child child = new Child();
        child.display();
    }
}

class Parent {
    int a;
    Parent(){ // 1.지정해주지 않았지만 기본적으로 자식 생성자는 디폴트 생성자를 불러준다 이를 없애면 오류남
        System.out.println("부모의 기본 생성자 호출 ");
        a = 10;
    }
    Parent(int n){
        System.out.println("부모의 생성자 호출 ");
        a = n;
    }
}


class Child extends Parent{
    int b;
    Child(){
        super(200); // 가장 먼저 불러줘야함.
        System.out.println("자식의 생성자 호출");
        //super(200);
        b=20;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }

}


