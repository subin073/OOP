package Chap_1;
import java.util.Scanner;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("정수를 입력하세요: ");
        int in1 = sc.nextInt();
        arr[0]=in1;
        System.out.println("현재까지 입력된 정수의 합은"+arr[0]+"입니다.\n");

        System.out.println("정수를 입력하세요: ");
        int in2 = sc.nextInt();
        arr[1]=in1+in2;
        System.out.println("현재까지 입력된 정수의 합은"+arr[1] +"입니다.\n");

        System.out.println("정수를 입력하세요: ");
        int in3 = sc.nextInt();
        arr[2]=arr[1]+in3;
        System.out.println("현재까지 입력된 정수의 합은"+arr[2] +"입니다.\n");

        System.out.println("정수를 입력하세요: ");
        int in4 = sc.nextInt();
        arr[3]=arr[2]+in4;
        System.out.println("현재까지 입력된 정수의 합은"+arr[3] +"입니다.\n");

        System.out.println("정수를 입력하세요: ");
        int in5 = sc.nextInt();
        arr[4]=arr[3]+in5;
        System.out.println("현재까지 입력된 정수의 합은"+arr[4] +"입니다.\n");

    }
}
