package 제네릭응용;

public class Water extends Material{

    public void doPrinting(){
        System.out.println("Plastic 재료로 출력 합니다.");

    }
    @Override
    public String toString(){
        return "재료는 Plastic 입니다.";
    }
}
