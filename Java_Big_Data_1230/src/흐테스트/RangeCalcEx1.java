package 흐테스트;
import java.util.*;
public class RangeCalcEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int q = left - 1; q < right; q++) {
                sum += arr[q];
            }
            list.add(sum);
            sum = 0;
        }
        list.stream().forEach(e -> System.out.println(e));



    }

}

