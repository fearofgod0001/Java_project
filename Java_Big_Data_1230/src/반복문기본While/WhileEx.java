package 반복문기본While;

public class WhileEx {
    public static void main(String[] args) {
        int treeHit = 0;
        while(treeHit < 10){
            treeHit++;
            System.out.println("나무 찍는 중.. " +treeHit + "번");
            if(treeHit == 10) System.out.println("나무 넘어 갑니다");
        }
    }

}
