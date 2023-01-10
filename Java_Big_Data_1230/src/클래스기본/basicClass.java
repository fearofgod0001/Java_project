package 클래스기본;

public class basicClass {
    public static void main(String[] args) {
            Car gv80 = new Car("제네시스","black","2020",320); //클래스로 객체 생성

        gv80.viewCar();
        gv80.name = "GV80 깡통";
        gv80.viewCar();
    }
}
class Car{
    static String manufacture = "현대자동차"; // 클래스 변수 (넓은 의미에서 필드)
    String name; // 인스턴스 필드 (클래스가 객체로 만들어 질 때 객체의 갯수 만큼 생성됨)
    String color; // 인스턴스 필드
    String productYear;
    int maxSpeed;
    //생성자 : 클래스 이름과 동일하고 반환 타입이 없다. void조차 없다.
    //생성자는 주로 개체 생성 시 객체 내부의 필드를 초기화 하는 목적으로 사용된다.
    //필드는 생성자의 매개변수로 전달 된다.( 객체를 생성하는 곳에서...)
    Car(String name,String color, String year, int speed){
        this.name = name; // 전달받은 매개 변수와 객체 내부의 필드의 이름이 같은 경우는 숨겨진 this 적어야 함
        this.color=color;
        productYear = year;
        maxSpeed = speed;
    }
    //Setter 메소드 : 인스턴스의 값을 설정하는 메소드
    void setName(String name){
        this.name = name;
    }
    void setColor(String color){
        this.color = color;
    }
    void viewCar() {
        System.out.println("제조사 : " + manufacture);
        System.out.println("이름 : " + name);
        System.out.println("출고 연도 : " + productYear);
        System.out.println("최고속도 : " + maxSpeed);
    }
}
