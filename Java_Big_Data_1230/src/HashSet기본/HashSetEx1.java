package HashSet기본;
//HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
//중복 여부 확인은 hashCode()의 리턴 값을 이용 합니다. (경우에 따라 오버라이딩 합니다.)

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1001,"123zz"));
        set.add(new Member(1002,"ㅇ태석"));
        set.add(new Member(1003,"태석이"));


        Member mem4 = new Member(1003,"이석태");
        set.add(mem4);

        for(Member e : set) {
            //System.out.println(e);
            e.show();
            System.out.println(e.hashCode());

        }


    }
}

class Member{
    int id;
    String name;
    @Override
    public int hashCode(){
        return id;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void show(){
        System.out.println("id는 " + id);
        System.out.println("이름은 "+ name);

    }
}