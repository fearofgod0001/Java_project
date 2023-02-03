package 쓰레드예제6;

public class InterrupThread extends Thread{
    @Override
    public void run(){
        try {
            while (true) {
                System.out.println("쓰레드 실행 중...");
                sleep(1);
            }
        }catch (InterruptedException e ){
            System.out.println("인터럽트 발생....");
        }
        System.out.println("종료");
    }

}
