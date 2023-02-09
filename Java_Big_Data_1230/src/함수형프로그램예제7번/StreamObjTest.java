package 함수형프로그램예제7번;

import java.util.*;


public class StreamObjTest {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("이태석",31,1000));
        customerList.add(new TravelCustomer("이석태",13,5000));
        customerList.add(new TravelCustomer("석태이",21,1600));
        customerList.add(new TravelCustomer("석이태",26,2000));
        customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum(); //토탈 여행비용
        System.out.println("총 가격 : " + total);

        System.out.println("==20세 이상 성인 출력==");
        customerList.stream().filter(c->c.getAge() >=20).map(c->c.getAge()).sorted().forEach(e->System.out.println(e));

    }
}

class TravelCustomer{
    String name;
    int age;
    int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getPrice() {
        return price;
    }
}
