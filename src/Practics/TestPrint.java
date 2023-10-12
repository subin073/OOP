package Practics;
import java.util.Scanner;

class PrintNum {
    int value;
    Scanner sc;
    PrintNum(Scanner sc){
        this.sc = sc; //현재 객체의 스캐너
    }

    void ReadInt(){
        System.out.println("정수 입력: ");
        int value = sc.nextInt();
    }

    boolean CheckNum(int num1, int num2){
        if (value >= num1 && value <= num2){
        return(true);
        } else {
            return (false);
        }
    }

    void PrintInt(){
        System.out.println(value);
    }


}
public class TestPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum PrintNum = new PrintNum(sc);
        PrintNum.ReadInt();//입력실핼

        if (PrintNum.CheckNum(1, 100)){
            PrintNum.ReadInt();
        }else {
            System.out.println("범위 밖 정수 입력");
        }
    }
}
