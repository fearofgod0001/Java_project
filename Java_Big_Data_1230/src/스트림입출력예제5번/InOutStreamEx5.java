package 스트림입출력예제5번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

public class InOutStreamEx5 {
    public static void main(String[] args) throws IOException {
        String originalFileName = "Java_Big_Data_1230/src/스트림입출력예제5번/cat.png";
        String targetFileName = "d:/clone_0209.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        int cnt = 0;
        byte[] buffer = new byte[100]; // 100바이트씩 읽음
        while((readByteNo = fis.read(buffer)) != -1){ //fis로부터 100바이트씩 읽음 근데 사이즈가 -1이면 읽을게 없다는 의미
           fos.write(buffer,0,readByteNo);
           cnt++;

        }
        fos.flush();
        fos.close();
        fis.close();
        System.out.print(cnt);

    }
}
