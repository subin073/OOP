package Homework;

import java.util.Scanner;

public class Practics {
    public static void main(String[ ]args){
       /* String name = "고앵이";
        int hour =  15;


        System.out.println(name + "에게 배송 시작, " +hour+ " 시 예정");
        System.out.println(name + "에게 배송 완료");

        double score = 90.5;
        char grade = 'a';
        name ="애옹";
        System.out.println(name + "평균 점수는"+score+"점이다");
        System.out.println("학점은" +grade+ "이다.");
        */

        /*final String KR_CODE="+82"; //국가번호
        final double PI = 3.141592;
        System.out.println(PI);
        final String Birth = "2003.07.30";
        System.out.println(Birth);*/

      /* int score = 93;
        System.out.println(score); //93
        System.out.println((float)score);  //93.0
        System.out.println((double)score); //93.0

        float score_f =93.3F;
        double score_d = 98.8;

        System.out.println((int)score_f);
        System.out.println((int)score_d);
        //정수 + 실수

        score = 93 +(int) 98.8;   //93+98

        double convertedScoreDouble = score;
        int convertedScoreInt = (int) score_d; //줄어들 때는 수동으로 형변환
        // 숫자를 문자열로
        String s1 =String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2= String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);
    //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8*/


       /* String busNum = "상암08" ;
        String eta = String.valueOf(3) +"분";
        String distance = String.valueOf(1.2) + "km";


        System.out.println(busNum + "번 버스");
        System.out.println( "약" + eta + " 후 도착");
        System.out.println("남은 거리: "+distance);*/
       /* int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val);//11

        val = 10;
        System.out.println(val++); //10
        System.out.println(val);  //11

        val =10;
        System.out.println(val--);
        System.out.println(val);

        int waiting =0;
        System.out.println("대기인원: " + waiting++); //0
        System.out.println("대기인원: " + waiting++); //1
        System.out.println("대기인원: " + waiting++); //2
*/
        //삼항 연산자
        //결과 =(조건)?(참의 경우 결과값) : (거짓의 경우 결과값)
       /* int x =5;
        int y = 3;
        int max = (x>y)?x:y;
        System.out.println(max);*/
/*
        int h = 195;
        String ok = ( h>= 120)?("키가"+ h +"cm이므로 탑승이 가능합니다!") : ("키가"+ h +"cm이므로 탑승이 불가능합니다ㅜㅜ");
        System.out.println(ok);*/

        //배열
        //String[] coffees = new String[4];
       /* String coffees[] = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";*/

     //   String coffees[] = new String[]{"아아", "라떼","초코"};
//        String coffees[] = new String[]{"아아", "라떼","초코"};
//        System.out.println(coffees[1]);

/*
        Scanner cat = new Scanner(System.in);
        String str = cat.nextLine();
        System.out.println(str);
*/
        /*
        Scanner sc1 = new Scanner(System.in);
        String str= sc1.nextLine();
        System.out.println("입력 문자열 " + str);

        int in = sc1.nextInt();
        System.out.println("입력 정수: "+in);
*/

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
