package 자동차만들기종합;

public class Bus extends Car{
    public Bus(String name) { //외부에서 받기로 함
        this.name = name;
        speed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }
    @Override
    public void setMode(boolean isMode) {
        if(isMode) fuelTank +=30;
    }
}
