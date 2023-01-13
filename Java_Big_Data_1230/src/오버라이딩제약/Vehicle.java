package 오버라이딩제약;

public class Vehicle {
    protected int speed; //protected 상속관계와 동일 패키지 내에서 접근 가능
    protected String color;
    protected String name;
    // final 은 최종 상태를 의미, 메소드에서 사용시 오버로딩이 불가 함을 의미한다.
    final void accelerator(){
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}

class SportsCar extends Vehicle{
    boolean isTurbo;
    SportsCar(String name){
        isTurbo = false;//터보 모드가 켜지면 차의 최고속도를 증가시킨다.
        speed = 280; //Vehicle로부터 상속받음
        this.name=name;//생성자로부터 이름을 입력 받아 인스턴스 필드의 초기값으로 사용
        color="red";
    }

    int getSpeed(){ //게터
        if(isTurbo) return speed *=1.2;
        return speed;
    }
    boolean getTurbo(){ //게터
        return isTurbo;
    }
    void setTurbo(boolean turbo){
        isTurbo = turbo;
    }
    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드  : " + isTurbo);
    }
}

class ElectricCar extends Vehicle{
    boolean isAutoDrv;
    ElectricCar(String name){
        isAutoDrv = false;
        speed = 200;
        this.name= name;
        color = "white";
    }
    boolean getAutoDrv(){
        return isAutoDrv;
    }
   void setAutodrv(boolean autoDrv){
        isAutoDrv  = autoDrv;
    }
    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율모드  : " + isAutoDrv);
    }

}
