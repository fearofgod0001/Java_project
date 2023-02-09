package 함수형프로그램예제5번;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거
public class StreamEx5 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
//
//        IntStream stream1 = IntStream.of(arr);
//        IntStream stream2 = IntStream.of(arr);
//        //스트림에서 홀수 값만 골라냄
////        stream2.filter(n->n%2 != 0).forEach(e ->System.out.print(e + " "));
////        System.out.println();
////        stream1.filter(n->n%2 == 0).forEach(r ->System.out.print(r + " "));
//        stream2.distinct().forEach(e ->System.out.println(e+" "));

//        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        for(int i =0; i<7;i++) list.add(sc.nextInt());
//        list.stream().filter(n->n%2 != 0).forEach(e ->System.out.print(e + " "));
//
//
       // int []arr1 = {1,2,3,4,5,6,7,8,9};
        //List<Integer> list2 = new ArrayList<>(arr);
       // list2.stream().filter(m->m%2 !=0).forEach(e ->System.out.println(e + " "));
//
//        //슽트림 변환 : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여,
//        // 그 반환 값으로 이루어진 새로운 스트림 생성

//        Stream<String> stream = Stream.of("HTML","CSS","JAVA", "JAVASCRIPT");
//        stream.map(e->e.length()).forEach(System.out::println);
//
//        String [] arr3 = {"I study jard", "You study JAVA","i am hungry"};
//        Stream<String> stream5 = Arrays.stream(arr3);
//        stream5.flatMap(s ->Stream.of(s.split(" "))).forEach(System.out::println);


        // 스트림 제한
        // limit() : 해당 스트림의 첫 번째 요소부터 주어진 개수 만큼의 ㅇ소로만 이루어진 새로운 스트림 반환

        // skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외하고 출력
        IntStream stream6 = IntStream.range(0,10);
        IntStream stream7 = IntStream.range(0,10);
        IntStream stream8 = IntStream.range(0,10);
        IntStream stream9 = IntStream.range(0,10);


        stream6.forEach(n->System.out.print(n));
        System.out.println();
        stream7.limit(5).forEach(n->System.out.print(n));
        System.out.println();
        stream8.skip(5).forEach(n->System.out.print(n));
        System.out.println();
        stream9.skip(3).limit(5).forEach(n->System.out.print(n + ""));

        // 스트림 정렬 : 해당 스트링을 주어진 비교자를 이용하여 정렬
        Stream<String>stream10 = Stream.of("HTML","CSS","JAVA", "JAVASCRIPT");
        Stream<String>stream11 = Stream.of("HTML","CSS","JAVA", "JAVASCRIPT");
        stream10.sorted().forEach(s -> System.out.println(s+ ""));
        System.out.println();
        stream11.sorted(Comparator.reverseOrder()).forEach(s ->System.out.print(s + " "));



























    }
}
