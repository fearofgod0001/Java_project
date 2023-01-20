package 자동차만들기종합;

public abstract class Car {
    protected int speed; //속도
    protected int fuelEff; //연비
    protected int fuelTank; //기름통
    protected int seatCnt;//좌석 수
    protected String name;

    //부가 기능은 각 차마다 다르기 때문에 부모는 기능만 명시 상속받은 자식
    public abstract void setMode(boolean isMode);

    public String getName(){
        return name;
    }

    //이동 횟수 구하기 : 외부의 입력값으로 승객의 수가 필요
    public int getMoveCnt(int passCnt){
        if(passCnt % seatCnt !=0) return (passCnt / seatCnt) +1;
        return passCnt / seatCnt;
    }
    //총 이동 비용은 매개변수로 거리와 이동 횟수가 필요
    public int getTTLCost(int dist, int moveCnt){
        return(dist / fuelEff* 2000) * moveCnt;
    }
    //총 주유 횟수 : 총 이동 거리를 구하고 이를 연비로 나눔
    public int getReFuelCnt(int dist , int moveCnt){
        if(((dist * moveCnt)/fuelEff ) % fuelTank !=0)
            return (((dist * moveCnt)/fuelEff) / fuelTank)+1;
        return ((dist * moveCnt)/fuelEff) / fuelTank;
    }

    //총 소요 시간
    public double getMoveTime(int dist, int moveCnt){
        return(double) dist * moveCnt / speed;
    }





}




