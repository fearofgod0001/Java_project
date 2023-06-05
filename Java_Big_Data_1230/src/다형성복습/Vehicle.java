package 다형성복습;

public class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle{
    @Override //어노테이션을 붙여주는 이유 : 문법적으로 오버라이딩 관계가 있는지 체크 하려고
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class SportsCar extends Vehicle{
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}


