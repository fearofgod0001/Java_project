package 쓰레드예제1번;
//멀티스레드
public class ThreadEx1 {
    public static void main(String[] args){

        TestThread tt = new TestThread();
        tt.start();
        int sum = 0;

        for(int i =0; i<= 100; i++){
            sum += i;
            System.out.println("여기는 메인 스레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
// 스레드를 만드는 방법 : Thread Class 를 상속 받는 방법이 있음(별로 좋은 방법은 아님)
class TestThread extends Thread{
    @Override
    public void run(){
        int sum = 0;
        for(int i =0; i<= 100; i++){
            sum += i;
            System.out.println("여기는 테스트 스레드 입니다."+sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }

}
