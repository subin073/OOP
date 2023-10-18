package Homework;
import java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n) {

        if (n == 0) {
            return m;
        }
        if (m % n == 0) {
            return n;
        }
        return gcd(n, m % n);
    }

            public static void main(String[] args) {

            Homework4 h = new Homework4();
            Scanner sc = new Scanner(System.in);
            System.out.println("두 정수를 입력: ");
            int m = sc.nextInt();
            int n = sc.nextInt();

            System.out.printf("최대공약수: %d", h.gcd(m, n));
    }


}
