package 다중인터페이스;

public class Car {
    protected int speed; // 접근제한자는 동일패키지와 상속관계에서 접근 가능
    protected String color;
    protected String year;
    public Car(){
        this.speed = 150;
        this.color = "white";
        this.year = "2022";
    }
}
