package 싱글톤;
//싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
//사용하는 이유 : 메모리의 효율성과 데이터 공유
//단점 : 구현이 까다로우, 데이터에 대한 무결성이 깨질 수 있음(멀티쓰레드에서 사용시 동기화가 필요)
// synchronized : 동기화 들어갈 때 키가 필요하다. 성능저하 유발
public class SingletonMain {
    public static void main(String[] args) {
        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.setInfo("이태석",21);
        ref2.viewInfo();


    }
}
