package Homework;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요?:  ");
        int NumCount = sc.nextInt();

        int[] NumArr = new int[NumCount]; //배열만들고

        System.out.println("수를 입력하세요: ");

        for (int i=0; i< NumArr.length; i++){
            NumArr[i] = sc.nextInt();
        }

        int max = NumArr[0];
        int min = NumArr[0];

        for (int i=0; i< NumArr.length; i++){
           // NumArr[i] = sc.nextInt();

            if (NumArr[i] >= max){
                max = NumArr[i];
            }

            if (NumArr[i] < min) {
                min = NumArr[i];
            }

            }
        System.out.printf("최댓값: %d", max);
        System.out.printf("최솟값: %d", min);

    }
}
