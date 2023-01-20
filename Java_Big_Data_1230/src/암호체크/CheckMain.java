package 암호체크;

import java.util.Scanner;

public class CheckMain {
    public static void main(String[] args) {
       PW pw = new PW();
       Scanner sc = new Scanner(System.in);

       for(;;) {
           pw.makepw();
           pw.pwchek();
           pw.mpassword();
            System.out.println("계속 하시겠습니까? ");
            String trufalse = sc.next();
             if(trufalse.equals("종료")||trufalse.equalsIgnoreCase("exit")) {
                 System.out.println("종료합니다");
                 break;
             }
       }
    }
}
