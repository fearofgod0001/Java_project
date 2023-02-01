package 클래스정렬예제1번;
//자동차 연식으로 정렬하기
public class CarSort implements Comparable<CarSort>{
    String modelName;
    String color;
    int modelYear;

    public CarSort(String modelName, String color, int modelYear) {
        this.modelName = modelName;
        this.color = color;
        this.modelYear = modelYear;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear){
            return this.modelName.compareTo(o.modelName); //앞의 문자열이 사전 순으로 뒤에 있으면 양수값 반환
        }
        return this.modelYear - o.modelYear; //앞 뒤 보다 크먼 정렬
    }


}
