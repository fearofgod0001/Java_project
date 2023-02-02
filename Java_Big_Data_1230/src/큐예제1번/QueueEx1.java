package 큐예제1번;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Queue : FIFO 구조, LinkedList 구조를 사용하고 있으며 ,LinkedList 기능 중 큐 관련 기능으로 제한
// add(e) : 맨 뒤에 요소를 삽입
// offer(e) : 맨 뒤에 요소를 삽입 = true/false
// remove() : 맨 앞의 요소 제거 - 예외 발생
// poll() : 맨 앞 요소 제거 - 비어있으면 null
// element() : 맨 앞의 요소를 읽어 옴 - 예외 발생
// peak() : 맨 앞의 요소를 읽어 옴 - 큐가 비어 있으면 null

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>();
        msgQ.offer(new Message("Mail","카즈하"));
        msgQ.add(new Message("SMS","안유진"));
        msgQ.offer(new Message("Kakao","윈터"));
        while(!msgQ.isEmpty()){
            Message msg = msgQ.poll();
            switch (msg.command){
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다");
                break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다");
                break;
                case "Kakao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다");
                break;
            }
        }

    }
}

class Message{
    String command;
    String to;

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }
}
