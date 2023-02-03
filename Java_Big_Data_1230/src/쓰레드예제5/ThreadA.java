package 쓰레드예제5;

public class ThreadA extends Thread{
    private WorkProject workProject;
    public ThreadA(WorkProject workProject){
        this.workProject = workProject;
    }
    @Override
    public void run(){
        for(int i  = 0; i < 10; i++){
            workProject.methodA();

        }
    }
}
