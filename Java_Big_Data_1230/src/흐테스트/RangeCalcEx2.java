package 흐테스트;

import java.util.*;
import java.util.stream.Collectors;

public class RangeCalcEx2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr  = new int[n];
        long[]sumArr = new long[n];
        for(int i = 0; i<n;i++){
            if(i==0) sumArr[0] = arr[0];
            else {sumArr[i]=arr[i]+sumArr[i-1];
            }
            int left = 0, right =0;
            while(x!=0){
                left = sc.nextInt();
                right = sc.nextInt();
                // 구간합 계산하기.
                if(left != 1) System.out.println(sumArr[right-1] - sumArr[left-2]);
                else System.out.println(sumArr[right-1] - 0);
                x--;
            }
        }




        int []arr1 = {5,4,3,2,1};
        List<Integer> list2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        for(int i = 0; i <3;i++){
            int ss = sc.nextInt();
            int nn = sc.nextInt();
            Optional<Integer> rst = list2.stream().skip(ss-1).limit(nn-ss+1).reduce((s1, s2)->s1+s2);
            rst.ifPresent(e ->System.out.println(e));
        }
    System.out.println(list2);
    }
}
