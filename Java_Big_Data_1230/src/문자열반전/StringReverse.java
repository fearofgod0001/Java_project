package 문자열반전;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arrName = a.toCharArray();
        for (int i = arrName.length - 1; i >= 0; i--)
            System.out.print(arrName[i]);

    }
}
