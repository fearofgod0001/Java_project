package 자동차만들기종합;

public class Sedan extends Car{
    public Sedan(String name) { //외부에서 받기로 함
        this.name = name;
        speed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    public void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;

    }
}
