package 쓰레드예제5;

public class ThreadB extends Thread{
    private WorkProject workProject;
    public ThreadB(WorkProject workProject){
        this.workProject = workProject;
    }
    @Override
    public void run(){
        for(int i  = 0; i < 10; i++){
            workProject.methodB();

        }
    }
}
