package 아이패드만들기;

import java.awt.desktop.ScreenSleepEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import static java.lang.Thread.sleep;

public class iPadProMake {
    private int screen;//화면 크기 : 11인치 12.9인치
    // [private] 디폴트는 패키지 내에서 모두 가능 private 정해진 방법 내에서만 변경 가능
    int color; // 색상 :  스페이스 그레이 / 실버
    int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크  : Wi-Fi, Wi-Fi+Cellular
    String name; // 각인서비스시 이름 저장
    String productData; // 제품 생산 일자
    String serialNum; // 제품 일렵너호 iPad13128C2301121
    static int cnt = 0; // 클래스 변수 : 객체 생성시 생성되지 않고 클래스 생성시 만들어짐 클래스 호출 시 매번 카운팅 되어야 하니까


   public iPadProMake(String name){
        this.name=name;
        Date now = new Date(); // 현재의 시간정보를 가져오기 위해 사용하는
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productData = sdf.format(now); //now 의 시간정보를 yyMMdd 양식으로 가져온다!
        cnt++; // 생성자는 객체가 만들어 질 때 호출 되므로 생성된 객체의 횟수를 확인하는 용으로 사용
        productData += cnt;
    }
    // 제품 구매에 대한 진행 여부를 묻는 메뉴
    public boolean continueOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== iPad Pro 구입하기 ====");
        System.out.println("구입 하시려면 yes / 종료는 quit : ");
        String isContinue = sc.nextLine();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        else return false;

    }
    //화면 크기 정하기
    public void setScreen() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("디스플레이 선택 [1]11인치, [2]12.9인치 : ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) return; //여기서 해당 메소드가 끝남
            System.out.println("디스플레이를 다시 선택 하세요. ");
        }
    }
    public void setColor(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("컬러 선택 [1]스페이스 그레이, [2]실버 : ");
            color=sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택하세요");
        }
    }

    public void setMemory(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("용량 선택 [1]128 , [2]256, [3]512, [4]1T :");
            memory = sc.nextInt();
            if(memory > 0 && memory <5) return;
            System.out.println("용량을 다시 선택 하세요");
        }
    }

    public void setNetwork(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("네트워크 선택 [1]Wi-Fi , [2]Wi-Fi+Cellular : ");
            network = sc.nextInt();
            if(network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }
    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("각인 서비스를 신청하시겠습니까? (yes / no)");
        String service = sc.nextLine();
        if(service.equalsIgnoreCase("yes")){
            System.out.println("이름을 입력 하세요 : ");
            name = sc.nextLine();
        }
    }
    //일렬 번호 만들기 : iPad + 11/13 + 128/256/512/1024 + W/C + 230112 + 생산댓수
    public  void setSerialNum(){
        String scStr = (screen == 1) ? "11" : "13";
        String []memStr  = {"","128","256","512","1024"};
        String netStr = (network == 1)? "W": "C";

        serialNum = "iPad" + scStr + memStr[memory] + netStr + productData + cnt;


    }

    //제품 구매가 완료되면 출고까지 30초 대기시간
    public void inProductPad() throws InterruptedException{
        int cnt = 0;
        while(true){
            sleep(300);
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r");//커서를 앞으로 간다 지우고 새로 출력
            if(cnt >= 100)break;

        }
    }
    public  void productPad(){
        final String[] scrType = {"", "11인치","12.9인치"};
        final String[] colorType = {"", "스페이스 그레이","실버"};
        final String[] memType = {"", "128","256","512","1T"};
        final String[] netType = {"", "Wi-Fi","Wi-Fi+Cellular"};
        System.out.println("==== iPad Pro 가 출고 되었습니다. ====");
        System.out.println("디스플레이 : " + scrType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("----------------------------");


    }

}
