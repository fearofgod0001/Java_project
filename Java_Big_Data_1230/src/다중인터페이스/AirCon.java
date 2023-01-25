package 다중인터페이스;

public interface AirCon {
    /* 인터페이스에서는 인스턴스값이 들어가지 않기 때문에
    * public final static 이 자동으로 추가된다.
    */
    int MAX_TEMP = 30;
    int MIN_TEMP = 0;

    abstract void airConON(); // 자동으로 추상메소드가 됨(abstract 자동으로 붙음)
    void airConOFF();
    void setAirConTemp(int tmp);

}
