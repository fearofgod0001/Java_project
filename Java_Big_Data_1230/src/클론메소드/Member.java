package 클론메소드;

//Cloneable 실제 구현해야할 메소드는 없음, clone() 메소드를 사용 가능하도록 권한을 부여
public class Member implements Cloneable{
    String id;
    String name;
    String pwd;
    int age;
    boolean isAdult;

    public Member(String id, String name, String pwd, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember(){
        Member cloned = null;
        try{
            cloned = (Member) clone();
        }catch (CloneNotSupportedException e){}
        return cloned;
    }
}
