package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        int num1, num2;
        double num3 = 3.14;
        int hour = 3;
        int minute = 5;
        System.out.println(hour+" 시 "+ minute +" 분");
        System.out.println();


        NameCard nc = new NameCard();
        nc.name = "곰돌이사육사";
        nc.age = 33;
        nc.address = "우리집";
        nc.eMail = "dl888@gmail.com";
        nc.phonenumber = "010-7555-5555";

        System.out.println(nc);


    }
}

class NameCard {
    String name;
    int age;
    String address;
    String eMail;
    String phonenumber;
}
