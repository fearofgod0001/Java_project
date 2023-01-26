package 스트링버퍼;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨, 동기화 지원
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존 문자열이 수정 됨 동기화 지원안됨 성능 우수
// String : 객체 생성 필요 없음, 문자열 추가 시 계속 새로운 문자열이 만들어 짐, 문자열 추가가 길어짐녀
// append() : 문자열을 추가 할 때 사용
public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.insert(0,"안녕하세요 ");
        //sb.delete(1,3);

        System.out.println(sb);
        System.out.println(sb.substring(7));
        System.out.println(sb.substring(0,7));


    }
}
