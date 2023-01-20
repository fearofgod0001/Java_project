package 메소드만들기;

public class Sample {
    String name;
    //생성자 : 클래스 이름과 동일하고 반환 타입이 없음, 클래스가 객체로 생성될 때 자동으로 호출
    // 생성자의 주요 목적은 클래스 내부의 인스턴스 필드를 초기화 함.
    Sample() {
        name = "anonymous";
    }
    Sample(String name){
        this.name=name;

    }
    //  이름을 읽는 메소드 (Getter)
    String getName() {
        return name;

    }

    // 접근제한자 붙이지 않으면 default 접근 제한자 특성을 가짐

    int sum(int a, int b){ //매개변수
        return a+b;
    }

    //
    int sum(int ... values){ //메소드의 매개 변수는 일반적으로 개수가 정해져있음 경우에 따라 개수를 알 수 없는 경우 ... 사용
        int sum = 0;
        for(int i  = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    //매개변수도 없고 반환값도 없는 메소드
    void say() {

        System.out.println("틀렸다");
    }
    String sayStr(){
        return "안녕하세요";
    }
}
