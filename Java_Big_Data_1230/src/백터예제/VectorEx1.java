package 백터예제;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// Vector는 ArrayList와 내부적으로 동일한 구조. 메소드 사용 방법도 완전히 동일.
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("이태석","010712328291",
                "dl1458","대장3","집"));
        list.add(new NameCard("dd태석","010751233291",
                "d12358","대장2","집"));
        list.add(new NameCard("asdz석","011233291",
                "12dsaa","대장1","집"));

        for(NameCard e : list){
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.number);
            System.out.println("메일 : " + e.mail);
            System.out.println("직급 : " + e.position);
            System.out.println("집 : " + e.address);

        }
    }
}

class NameCard{
    String name;
    String number;
    String mail;
    String position;
    String address;

    public NameCard(String name, String number, String mail, String position, String address) {
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }



}