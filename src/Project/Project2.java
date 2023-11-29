package Project;
import java.util.Scanner;

class Microwave{
    private int electricPower;
    private int cookTime;
    private boolean operation;

    //생성자
    public Microwave(){
        this.electricPower = electricPower;
        this.cookTime = cookTime;
        this.operation = operation;
    }
    enum menu {
        계란찜(700, 200), 라면끓이기(1000, 300), 감자삶기(700, 600);

        private int elctricPower;
        private int cookTime;
        menu(int electricPower, int cookTime) {
            this.elctricPower = electricPower;
            this.cookTime = cookTime;
        }
        int getElctricPower() {return elctricPower;}
        int getCookTime() {return cookTime;}
    }

    public void powerConsumptionSetting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력값 (200, 500, 700, 1000 중 하나)>");
        electricPower = sc.nextInt();
        if(electricPower == 200 || electricPower == 500 || electricPower == 700 || electricPower == 1000){
            System.out.printf("소비 전력: %dW, 요리시간: %d 초, 동작 중: 아니오\n",electricPower ,cookTime);
        }else{
            System.out.println("소비 전력(W)은 200, 500, 700, 1000만 지원합니다.\n");
            electricPower = 0;
        }
    }

    public void cookingTimeSetting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("입력값 (1~900)>");
        cookTime = sc.nextInt();
        if(cookTime > 0 && cookTime <= 900){
            //System.out.printf("소비 전력: %dW, 요리시간: %d 초, 동작 중: 아니오",electricPower ,cookTime);
        }else{
            System.out.println("유효한 요리 시간(초)이 설정되어야 합니다.\n");
            cookTime = 0;
        }
    }
    public void start(){
        System.out.println("동작이 시작합니다.");
        System.out.println("소비 전력:" + electricPower + "W, 요리 시간:" + cookTime + "초, 동작 중:예");
    }
    public void end(){
        System.out.println("동작이 중지되었습니다.");
        System.out.println("소비 전력:" + electricPower + "W, 요리 시간:0초, 동작 중:아니오\n");

    }
    public void statusPrint() {
        System.out.println("소비 전력:" + electricPower + "W, 요리 시간:" + cookTime + "초, 동작 중:아니요\n");
    }
    public void programSetting(){
        if(cookTime == 0 && electricPower == 0){
            System.out.println("요리 시간이 설정되지 않았습니다.\n");

        }
    }

}
public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Microwave microwave = new Microwave();
        boolean operation = true;
        System.out.println("안녕하세요~ 저는 전자레인지입니다.");

        while (operation) {
            System.out.println("1.계란찜, 2.라면끓이기, 3.감자삶기, 4.시간(초) 설정, 5.소비 전력(W) 설정, 6.조리 시작, 기타. 종료");
            System.out.println("메뉴 선택>");
            int n = sc.nextInt();


            switch (n) {

                case 1:
                    System.out.printf("소비 전력: %dW, 요리 시간: %d, 동작 중: 아니오\n ", Microwave.menu.계란찜.getElctricPower(), Microwave.menu.계란찜.getCookTime());
                    break;
                case 2:
                    System.out.printf("소비 전력: %dW, 요리 시간: %d, 동작 중: 아니오\n ", Microwave.menu.라면끓이기.getElctricPower(), Microwave.menu.라면끓이기.getCookTime());
                    break;
                case 3:
                    System.out.printf("소비 전력: %dW, 요리 시간: %d, 동작 중: 아니오\n ", Microwave.menu.감자삶기.getElctricPower(), Microwave.menu.감자삶기.getCookTime());
                    break;
                case 4:
                    microwave.cookingTimeSetting();
                    microwave.statusPrint();
                    break;
                case 5:
                    microwave.powerConsumptionSetting();
                    microwave.statusPrint();
                    break;
                case 6:
                    microwave.programSetting();
                    microwave.start();
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    microwave.end();
                    break;

                default:
                    System.out.println("안녕히 계세요~ 전자레인지였습니다.\n");
                    operation = false;
                    break;
            }
        }


    }
}

