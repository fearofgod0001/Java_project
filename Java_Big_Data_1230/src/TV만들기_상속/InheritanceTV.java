package TV만들기_상속;
// 상속관계가 있는TV
// 오버라이딩 적용
public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집TV");
        lgTV.setPower(true);
        lgTV.setVolume(120);
        lgTV.setChannel(1900 , true);

        lgTV.viewTV();



    }
}
