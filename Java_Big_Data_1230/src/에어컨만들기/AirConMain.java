package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon= new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0;
        boolean isSetTemp = false;
        System.out.println("에어컨을 켜시겠습니까?(yes/no) : ");
        String isON = sc.next();
        if(isON.equalsIgnoreCase("yes")){
            lgAirCon.setPower(true);
            lgAirCon.serAirConState();
            while(true){
                sleep(1000); //1초
                elapsedTime++;
                switch (lgAirCon.getWindStep()){
                    case 1 :
                        if(elapsedTime >=60) isSetTemp = true; break;
                    case 2 :
                        if(elapsedTime >=30) isSetTemp = true; break;
                    case 3 :
                        if(elapsedTime >=20) isSetTemp = true; break;
                    default:
                }
                
                if(isSetTemp){
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }



                if(lgAirCon.getCurrTemp()==lgAirCon.getSetTemp()){
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
