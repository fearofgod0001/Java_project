package 회원정보조합;

public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo(); //memberInfo 클래스를 객체로 만듬
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.viewinfo();

    }

}
