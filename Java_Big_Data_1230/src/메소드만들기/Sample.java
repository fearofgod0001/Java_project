package 메소드만들기;

public class Sample {
    // 접근제한자 붙이지 않으면 default 접근 제한자 특성을 가짐
    int sum(int a, int b){
        return a+b;
    }
    //매개변수도 없고 반환값도 없는 메소드
    void say() {

        System.out.println("틀렸다");
    }
    String sayStr(){
        return "안녕하세요";
    }
}
