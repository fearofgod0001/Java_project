package 스트림입출력예제2번;
// InputStream : 바이트 기반의 입력 스트림 최상위 클래스로 추상 클래스 입니다.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while(true) {
//            int data = is.read(); //
//            if(data == -1)break;//파일의 끝에 도달
//            System.out.println(data + " ");
            int readByteNumber = is.read(buffer,1,2); //매개변수로 전달한 buffer에 값을 담음
            if(readByteNumber == -1) break;
            for(int i = 0; i<buffer.length; i++){
                System.out.print(buffer[i] + " ");
            }
        }
        is.close();//읽기 위해 열어둔 스트림을 닫음
    }
}