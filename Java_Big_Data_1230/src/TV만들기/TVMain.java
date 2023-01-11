package TV만들기;

public class TVMain {
    public static void main(String[] args) {
        TVClass samsungTV = new TVClass(); //기본 생성자 호출
        //TVClass lgTV = new TVClass(true,59, 15); //매개변수가 있는 클래스 호출

        //lgTV.getTV();


        samsungTV.setChannel(500);
        samsungTV.setVolume(20);
        samsungTV.getTV();
    }
}
