package 대문자출력;

import java.io.*;

public class alphabet {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String arr = br.readLine();

        for(int i = 0; i <arr.length(); i++){
            if(arr.charAt(i) >='A' && arr.charAt(i) <='Z'){
                System.out.print(arr.charAt(i));
            }
        }
    }
}
