package 정적메소드;


import static 정적메소드.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오",1000);
        Bank shinHan = new Bank("신한", 1000);
        Bank NH = new Bank("농협", 0);
        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); //getCount()메소드는 정적 메소드이며, 클래스 소속 1번만 만들면 됨

        System.out.println("현재 시간은");
        System.out.println(Util.gerCurrentData("yyyy년MM월dd일 hh:mm:ss"));
        System.out.println("도메인 주소 : " + DOMAIN);
    }
}
