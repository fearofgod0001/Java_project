package 큐예제2번;

import 큐예제1번.QueueEx1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx2 {

        Queue<String> queue = new LinkedList<>();
        final static int MAX_SIZE = 10;
        public static void main(String[] args) {
            QueueEx2 history = new QueueEx2();
            System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
            while(true){
                System.out.print("$");
                Scanner sc = new Scanner(System.in);
                String cmd = sc.nextLine().trim();
                if(cmd.equalsIgnoreCase("q")){
                    System.exit(0);
                } else if (cmd.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q/Q - 프로그램 종료");
                    System.out.println("history - 최근 입력한 명령어를 "+ MAX_SIZE + "개 보여 줍니다.");
                }else if(cmd.equalsIgnoreCase("history")){
                    history.save(cmd);
                    int cnt = 0;
                    for(String e : history.queue){
                        cnt++;
                        System.out.println(cnt + " "+e);
                    }
                }
            }
    }

    void save(String cmd){
            queue.offer(cmd);
            if(queue.size() > MAX_SIZE)queue.remove();
    }
}
