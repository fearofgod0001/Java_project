package 문자열다루기;
// equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴
public class StringType {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase("HELLO"));//대소문자 무시
        System.out.println(a==c); // 문자열의 주소를 비교

        String d = "hello java java";
        System.out.println(d.indexOf("java"));//문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴
        //contains : 문자열에 특정 문자열의 포함 여부
        System.out.println(d.contains("hello"));
        // charAt : 문자열에서 특정 위치의 문자를 리턴

        System.out.println(d.charAt(2));
        // replaceAll : 문자열 중 특정 문자열을 다른 문자열로 대체 할 때 사용
        String language = "java, Python, C, C++, JavaScript, Kotlin, Swift";
        System.out.println(language.replaceAll("Kotlin", "Jet Brain"));
        //substring : 문자열 중 특정 문자열을 뽑아낼 때 사용
        String e = "hello java";
        System.out.println(e.substring(6));//시작 인덱스부터 끝까지 추출
        System.out.println((e.substring(1,4)));// 시작인덱스부터 종료 인덱스 미만까지 추출
        //toUpperCase/ tpLowerCase: 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        //  trim : 문자열의 앞 뒤에 있는 공백 제거
        String str = " 자바 프로그맹  ?  !!!!!!! ";
        System.out.println(str.trim());
        // 문자열 포매팅이란? 문자열에 특정 문자를 삽입하는 방법( 삽입을 위해서는 서식이 필요)
        System.out.printf("자바 프로그래밍을 %s 합시다/\n","열심히");
        String newStr = "";
        int number = 10;
        String day ="three";
        newStr = String.format("자바 %d 프로 %s 그램을 %s 합시다.\n",number,day,"열심히");
        System.out.println(newStr);

        //toCharArray() : 문자열을 문자 배열 반환
        String name = "이태석";
        char[] arrName = name.toCharArray();;//문자열을 문자로 구성된 배열로 만듬
        System.out.println();




    }
}
