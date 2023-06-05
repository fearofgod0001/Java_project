package 인터페이스복습1번;

import java.util.Scanner;

public class CocoaTalkMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("이태석");
        cocoaTalk.writeMsg("벌써 여름이 왔네요.");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크 [1]Wifi [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTalk.send(adapter);


    }
}
