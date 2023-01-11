package TV만들기;

public class TVClass {
    private boolean isON; //전원 버튼, 접근 제한자 private 설정(같은 클래스 내에서만 접근 가능)
    private int channel; // 0~999
    private int volume; // 0~100
    private String name;


    TVClass(){
        isON = false;
        channel = 10;
        volume = 14;
        name = "기본 TV";
        System.out.printf("기본 생성자 호출, 전원 : %b, 채널 : %d, 볼륨 : %d\n",isON,channel,volume);
    }
    TVClass(boolean isON, int cnl, int vol, String name){
        this.isON = isON;
        channel = cnl;
         volume = vol;
         this.name = name;
    }
    // 외부에서 전원을 ON/OFF 할 수 있는 기능을 제공
    public void setON(boolean isON){
        this.isON = isON;
        String onOffStr = (isON) ? "On" : "Off";
        System.out.println("TV가 " + onOffStr + " 되었습니다.");
        }

    public void setChannel(int cnl){
        if(cnl >=0 && cnl <= 999){
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경 하였습니다.");
        }else {
            System.out.printf("채널 설정 범위가 아닙니다.");
        }
    }
    public void setVolume(int vol){
        if(vol >= 0 && vol <=100){
            volume = vol;
            System.out.println("볼륨을 " + volume + "으로 변경 하엿습니다.");
        }else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }

    }

    public void setName() {


    }
    public void getTV(){
        String onOffstr = (isON) ? "ON" : "OFF";
        System.out.println("=====tv정보====");
        System.out.println("전원 : " + isON );
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);

    }


}
