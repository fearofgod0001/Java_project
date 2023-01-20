package 자동차만들기종합;

public class SportCar extends Car{

    public SportCar(String name) { //외부에서 받기로 함
        this.name = name;
        speed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    public void setMode(boolean isMode) {
        if(isMode) speed *= 1.2;



    }
}
