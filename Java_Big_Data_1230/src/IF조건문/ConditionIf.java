package IF조건문;

import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;){
            System.out.print("정수를 입력하세요 : ");
            int number = sc.nextInt();
        if(number > 100){
            System.out.println(number + "는 100보다 큽니다.");
        }else if(number == 100){
            System.out.println(number + "는 100과 같습니다.");
        }else{
            System.out.println(number + "는 100보다 작습니다.");
        }  System.out.println("=====다시 입력하세요======");
    }

    }
}
