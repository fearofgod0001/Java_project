package 함수형프로그램예제1번;
//함수형 프로그램이란 자바 8에서 도입, 수학공식과 불변성의 원칙, 조건문, 반복문 사용 금지 등의 특징
//람다 : 화살표 표현식으로 사용됩니다. 생략 가능한 모든 것을 생략하는 것을 기본원칙으로 합니다.
//함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 함수형 인터페이스가 필요 합니다.


interface Caculator{
    int sum(int a, int b);
}
class MyCalculator implements Caculator {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}


public class FunctionEx1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        int rst = mc.sum(3,4);
        System.out.println(rst);

    }
}
