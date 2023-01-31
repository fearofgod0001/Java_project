package 로또번호생성리스트이용;

import java.util.*;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        int tmp;
        while(true){
            tmp = (int)(Math.random()*45)+1;
            if(!list.contains(tmp)) list.add(tmp);
            if(list.size() == 6)break;

        }
        for(Integer e : list) System.out.print(e +" ");
    }
}
