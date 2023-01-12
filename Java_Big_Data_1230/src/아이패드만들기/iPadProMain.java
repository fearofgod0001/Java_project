package 아이패드만들기;

public class iPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            iPadProMake iPad = new iPadProMake("iPad Pro");
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductPad();
            iPad.productPad();

            iPad.name ="간다"; //접근 제한자 특성이 default기 때문에 가능
            System.out.println(iPad.name);
        }
    }
}
