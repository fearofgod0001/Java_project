package 암호체크;

import java.util.Scanner;

public class PW {
    Scanner sc = new Scanner(System.in);
    String password;
    String mpw;
    void makepw() {
        System.out.println("패스워드를 입력하세요 : ");

        boolean i = true;
        while (i) {
            password = sc.next();
            if (password.length() < 10 && password.length() < 31) {
                System.out.println("잘못 입력 하였습니다.다시 입력하세요");
            } else {
                i = false;
            }
        }
    }

    void pwchek(){
        String [] pw = password.split("");
        for(int i  = 0; i< pw.length;i++){
            switch (pw[0]){
                case "!":
                    break;
                case "%":
                    break;
                case "_":
                    break;
                case "#":
                    break;
                case "&":
                    break;
                case "+":
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                default:
                    System.out.println("특수문자가 포함 되어있지 않습니다.");
                    makepw();

            }
        }
    }

    void mpassword(){
        System.out.println("비밀 번호를 입력 하세요");
        mpw = sc.next();
        String [] pw = password.split("");
        String [] checkpw = mpw.split("");



        if(password.equals(mpw)){
            System.out.println("Good password");
        } else {
            System.out.println("Bad password");
        }
    }

}