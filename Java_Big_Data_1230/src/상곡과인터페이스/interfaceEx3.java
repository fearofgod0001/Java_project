package 상곡과인터페이스;

import java.util.Scanner;

public class interfaceEx3 {
    public static void main(String[] args) {
        //NetworkAdapter2 adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크 선택 [1]WiFi [2]5G");
        int sel = sc.nextInt();
        if(sel == 1){
            WiFi wiFi = new WiFi("kt" , "이태석");
            wiFi.connect();
            wiFi.sendMsg();
            wiFi.rcvMsg();
            //adapter = new WiFi("KT","이태석");
            //adapter.connect();
        }else {
            FiveG fiveG = new FiveG("SK","석태이");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg();
        }
    }
}
