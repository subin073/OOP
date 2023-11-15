package Practics;
import java.util.Scanner;
public class Year {


        public static void main(String[] args) {

            // 년도 입력
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();

            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
                System.out.println("윤년");
            else
                System.out.println("평년");
        }

}
