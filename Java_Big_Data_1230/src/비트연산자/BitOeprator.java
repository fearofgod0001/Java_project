package 비트연산자;
//비트 연산자 : 비트 단위로 연산을 수행
// & ( 비트 AND) : 두개의 비트가 모두 1이면 1
// | (비트 OR) : 둘 중 한개만 비트만 읽으면 1
// ^ (XOR) : 두개의 비트 값이 같으면 0, 다르면 1
// ~ (비트의 값을 반전) : 비트가 0이면 1, 1이면, 0
// << (Shift 연산자) : 지정된 수만큼 왼쪽으로 비트를 이동 시킴.
// >> (Shift 연산자) : 지정된 수만큼 오른쪽으로 비트를 이동 시킴.


public class BitOeprator {
    public static void main(String[] args) {
        int num1 = 10; // 1010
        int num2 = 12; // 1100
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1); // 1010 > 10100
        System.out.println(num1 >> 1); // 1010 > 101

    }
}

