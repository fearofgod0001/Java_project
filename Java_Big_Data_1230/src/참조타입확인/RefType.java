package 참조타입확인;

//참조 변수의 ==
public class RefType {
    public static void main(String[] args) {
//        int x = 0; // 초기값 부여
//        String str = null; //참조형으로 주소가 올 수도 있기 때문에 참조하지 않는 다는 의미로  null
//        int [] intArray = null; //참조하는게 현재 없다.
//        Integer value = null;
//        int val2 = val; //nullPointExeption
        String name1 = "이태석";
        String name2 = "이태석";
        String name3 = new String("이태석");
        if (name1 == name3) {
            System.out.println("두개의 이름에 대한 참조가 같음1");
        } else {
            System.out.println("두개의 이름에 대한 참조가 다름1");
        }
        if (name1.equals(name3)) {
            System.out.println("두개의 이름에 대한 내용이 같음2");
        } else {
            System.out.println("두개의 이름에 대한 내용이 다름2");

        }
    }
}
