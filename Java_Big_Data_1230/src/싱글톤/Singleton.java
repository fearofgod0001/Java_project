package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton() { //생성자를 통해서 객체가 생성되지 않도록 접근제한을 설정
        name = "test";
        id = 100;

    }
    //getSingleton()메소드를 호출 시반환값으로 이밈 ㅏㄴ드렁져 있는 싱글톤 ㅐㄱ체으 ㅣ 참조 변수를 반환
    static Singleton getSingleton() {
        return singleton; //이미 만들어 놓은 건 참조할 수는 있음.
    }
}
