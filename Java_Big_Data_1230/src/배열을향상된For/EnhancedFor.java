package 배열을향상된For;
//향상된 for문은 배열 요소를 처음부터 끝까지 자동 순회
public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = new int[3]; // 타입[] 참조변수 = new 타입[크기]
        score[0] = 90;
        score[1] = 88;
        score[2] = 70;
        int sum = 0;

        for(int e  : score){
            sum += e;
        }

        System.out.println("총합 : "+ sum);
        System.out.println("평균 : "+ (double)sum/score.length);
    }
}
