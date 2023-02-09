package 스트림입출력예제1번;
// 입출력 스트림 : 컴퓨터 내부와 외부 장치간에 데이터를 주고 받는 것을 의미
// 입출력 데이터를 공통적인 방법으로 처리하기 위한 스트림을 제공
// 바이트 스트림 : 바이트 단위로 데이터를 전송 하는 것, 성능이 우수하고 파일로 저장시 결과 확인 불가
// 바이트 스트림의 최상위 추상 클래스는 OutputStream 입니다.


import java.io.*;

public class InOutStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.bin");

        byte[] array = {1,2,3,4,5};
        os.write(array); // 문자 배열을 write 하기
        os.write(array,1,3); // 배열 1부터 4개를 출력

        os.flush(); //반드시 버퍼를 비우는 동작이 필요함.
        os.close(); // 자원 반납 및 스트림 닫기

    }
}
