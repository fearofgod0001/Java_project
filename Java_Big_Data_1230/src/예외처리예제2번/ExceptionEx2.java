package 예외처리예제2번;

import java.io.*;
//FineNotFoundException : 존재하지 않는 파일 열려고 시도 할 때 발생합니다.
public class ExceptionEx2 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            br.readLine();
            br.close();
            bw.flush();
        }catch (IOException e){
            System.out.println(e);
            System.out.println("파일이 없습니다.");
        }

    }
}
