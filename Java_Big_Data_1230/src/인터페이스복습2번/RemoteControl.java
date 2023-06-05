package 인터페이스복습2번;
// 인터페이스는 설계도면으로만 사용하기 위해서 사용되는 완전 추상화 개념이 적용 됨
// 디폴트 메소드 : 구현부를 가짐, 상속 받은 클래스가 재정의 해서 사용할 수 있음
public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 final static 이 추가 됨
    int MIN_VOLUME = 0;
    void turnON(); // 자동으로 public abstract 추가
    void turnOFF();
    void setVolume(int volume);
    static void changeBattery(){ // 정적 메소드, 상속 되지 않으므로 구현부가 있음
        System.out.println("건전지를 교환 합니다.");
    }
    default void setMute(boolean mute){
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }

}
