package 다형성응용1;
// 매개변수의다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();//구매하는 객체
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();
        buyer.buy(tv);
    }
}
