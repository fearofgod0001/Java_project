package 연산자우선순위;

public class OpPriority {
    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int rs1, rs2, rs3;
        rs1 = val1 + val2 * val3;
        rs2 = (val1 + val2) * val3;
        rs3 = val1 + (++val2) * val3;

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);


    }
}
