package Practics;
import java.util.Scanner;

public class Project1 {
    private String[]hisArr = new String[10];
    private int hisIndex = 0;
    private String lastSt = "";
    private int listIndex = 0;

    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("jshell> ");
        String func = sc.next();

        //history
        if(func.equals("/history")){
           printHis();
        }

        //list
        if (func.equals("/list")) {
            printList();
        }

        // /! 입력
        if (func.equals("/!")) {
            if (lastSt.contains("") == false) {
                System.out.println("Re-running '" + lastSt + "'.");
                inFroLastSt(lastSt); // 마지막 명령어 실행
            } else {
                System.out.println("No previous command found.");
            }
        }

        //'/'로 시작하지만 기재되지 X
        //특정문자 존재하는지 -> contains()
        if (func.indexOf("/") == 0 && func.contains("/list")== false && func.contains("/exit")== false && func.contains("/history")== false && func.contains("/!")== false && func.contains("/help")== false ){
            System.out.println("Invalid command:" + func);
            System.out.println("Type /help for help\n\n");
        }

        //맨앞 '/' X
        //인덱스 번호 찾기 -> indexof()
        if (func.indexOf("/") != 0){
            System.out.println("Running '" + func + "'");
            input();
        }

        //help
        if(func.equals("/help")){
            System.out.println("Type a Java language expression, statement, or declaration.");
            System.out.println("Or type one of the following commands:");
            System.out.println("/list: list the source you have typed.");
            System.out.println("/exit: exit the jshell tool");
            System.out.println("/!: return last snippet.\n\n ");
        }


        //exit 후 종료
        if(func.equals("'/exit")){
            System.out.println("Goodbye.");
            return;
        }

        input();
    }


    //history에 추가
    private void addHis(String input){

        if (hisIndex >= hisArr.length){
            System.out.println("The history buffer is cleared.\n");
            hisArr = new String[10];
            hisIndex = 0;
        }
        hisArr[hisIndex] = input;
        hisIndex++;
    }

    private void printHis(){
        for(String st : hisArr){
            if(st !=null){
                System.out.println(st);
            }
        }
    }
    private void inFroLastSt(String st){
        addHis((st));
        input();
    }

    // /list 출력
    private void printList() {
        for (int i = 0; i < hisIndex; i++) {
            if (hisArr[i].charAt(0) == '/') {
                continue;
            }
            listIndex++;
            System.out.println(listIndex + " : " + hisArr[i]);
        }
        listIndex = 0; // 리스트 인덱스 초기화
    }



    public static void main(String[] args) {
        Project1 pro = new Project1();

        pro.input();

    }
}


