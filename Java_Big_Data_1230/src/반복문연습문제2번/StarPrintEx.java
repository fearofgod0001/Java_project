package 반복문연습문제2번;

import javax.imageio.IIOException;
import java.io.*;

public class StarPrintEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }


        for (int i = n; i >= 0; i--) {
            System.out.println(" ");
            for (int j = 1; j <=i;j++) {
                System.out.print("*");
            }
        }

    }
}

