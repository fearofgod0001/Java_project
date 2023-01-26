package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("이태석",DevType.FRONTEND,Career.JUNIOR,Gender.MALE);
        developer.devInfo();

        Developer developer1 = new Developer("이석태",DevType.FRONTEND,Career.JUNIOR,Gender.MALE);
        developer.devInfo();
    }
}
