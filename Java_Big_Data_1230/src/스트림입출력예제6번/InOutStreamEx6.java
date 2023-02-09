package 스트림입출력예제6번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InOutStreamEx6 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try{
            inputStream = new FileInputStream("test.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace(); // e 죽었던 경로를 스택에 담아둠.죽었던 원인을 리스트로 담아줌.
            System.out.print("파일이 없습니다.");
        }

        Scanner sc = new Scanner(inputStream); //text.txt 를 입력받음
        while(sc.hasNextLine()){ //다음 라인이 있는지 여부
            String line = sc.nextLine(); //있으면 입력
            System.out.print(line);

        }

    }
}
