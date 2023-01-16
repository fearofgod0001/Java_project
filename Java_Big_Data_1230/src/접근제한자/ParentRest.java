package 접근제한자;

public class ParentRest {
    public String name; //누구든지 접근가능
    protected String money; //동일 채키지와 다른 패키지의 상속관계가 있으면 접근 가능
    protected String addr; // 디폴트 접근가능 동일 패키지 내에서만 접근 가능
    public ParentRest(){//생성자는 거의 모든 경우 public으로 생성
            name = "이태석";
            money = "100억";
            addr = "서울특별시";

    }
}
